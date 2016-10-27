package com.bbms.web.dao;

import com.bbms.web.models.donor.CombinedCommandObject;
import com.bbms.web.models.donor.DonorHealthRelatedInformation;
import com.bbms.web.models.donor.DonorHistory;
import com.bbms.web.models.donor.DonorPersonalInformation;
import com.bbms.web.models.donor.DonorPreviousDonationHistory;
import com.bbms.web.models.donor.DonorSufferingHistory;
import com.bbms.web.models.donor.DonorTransfusionClottingFactory;
import com.bbms.web.models.donor.DonorTypeAndConsent;
import com.bbms.web.models.donor.Questions;
import java.util.Calendar;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DonorDAOImpl implements DonorDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private DonorPersonalInformation donorPersonalInformation;
    private DonorPreviousDonationHistory donorPreviousDonationHistory;
    private DonorHealthRelatedInformation donorHealthRelatedInformation;
    private DonorTypeAndConsent donorTypeAndConsent;
    private DonorTransfusionClottingFactory donorTransfusionClottingFactory;
    private DonorHistory donorHistory;
    private DonorSufferingHistory donorSufferingHistory;
    private Questions questions;

    @Override
    public synchronized void saveDonor(CombinedCommandObject combinedCommandObject) {

        donorPersonalInformation = combinedCommandObject.getDonorPersonalInformation();
        donorPersonalInformation.setDonorId(this.generateDonorId());
        sessionFactory.getCurrentSession().persist(donorPersonalInformation);
        donorPersonalInformation = this.findDonorById(this.getLastInsertId());

        donorPreviousDonationHistory = combinedCommandObject.getDonorPreviousDonationHistory();
        donorPreviousDonationHistory.setDonor(donorPersonalInformation);
        donorPreviousDonationHistory.setDonorId(donorPersonalInformation.getDonorId());
        sessionFactory.getCurrentSession().persist(donorPreviousDonationHistory);

        donorHealthRelatedInformation = combinedCommandObject.getDonorHealthRelatedInformation();
        donorHealthRelatedInformation.setDonor(donorPersonalInformation);
        donorHealthRelatedInformation.setDonorId(donorPersonalInformation.getDonorId());
        sessionFactory.getCurrentSession().persist(donorHealthRelatedInformation);

        donorTypeAndConsent = combinedCommandObject.getDonorTypeAndConsent();
        donorTypeAndConsent.setDonor(donorPersonalInformation);
        donorTypeAndConsent.setDonorId(donorPersonalInformation.getDonorId());
        sessionFactory.getCurrentSession().persist(donorTypeAndConsent);

        donorTransfusionClottingFactory = combinedCommandObject.getDonorTransfusionClottingFactory();
        donorTransfusionClottingFactory.setDonor(donorPersonalInformation);
        donorTransfusionClottingFactory.setDonorId(donorPersonalInformation.getDonorId());
        sessionFactory.getCurrentSession().persist(donorTransfusionClottingFactory);

        donorHistory = combinedCommandObject.getDonorHistory();
        donorHistory.setDonor(donorPersonalInformation);
        donorHistory.setDonorId(donorPersonalInformation.getDonorId());
        sessionFactory.getCurrentSession().persist(donorHistory);

        donorSufferingHistory = combinedCommandObject.getDonorSufferingHistory();
        donorSufferingHistory.setDonor(donorPersonalInformation);
        donorSufferingHistory.setDonorId(donorPersonalInformation.getDonorId());
        sessionFactory.getCurrentSession().persist(donorSufferingHistory);

        questions = combinedCommandObject.getQuestions();
        questions.setDonor(donorPersonalInformation);
        questions.setDonorId(donorPersonalInformation.getDonorId());
        sessionFactory.getCurrentSession().persist(questions);
    }

    @Override
    public Integer getLastInsertId() {
        final String sql = "SELECT max( i.id ) FROM " + DonorPersonalInformation.class.getSimpleName() + " i";
        Integer lastId = (Integer) sessionFactory.getCurrentSession().createQuery(sql).uniqueResult();
        return lastId;
    }

    @Override
    public String generateDonorId() {
        int newId;
        Integer lastId = this.getLastInsertId();
        String newGeneratedString = "";

        Calendar calender = Calendar.getInstance();
        int year = calender.get(Calendar.YEAR);
        if (lastId == null) {
            //System.out.println("newId if not One  " + "DONOR-" + year + "-" + 000001);
            return "DONOR-" + year + "-00000" + 1;
        } else {
            newId = lastId + 1;
            String lengthOfId = "" + newId;
            for (int i = lengthOfId.length(); i <= 5; i++) {
                newGeneratedString += "" + 0;
            }
            newGeneratedString += newId;
            //System.out.println(newGeneratedString);
            //System.out.println("newId if not One  " + newGeneratedString);
            return "DONOR-" + year + "-" + newGeneratedString;
        }

    }

    @Override
    public DonorPersonalInformation findDonorById(Integer donorId) {
        return (DonorPersonalInformation) sessionFactory.getCurrentSession().get(DonorPersonalInformation.class, donorId);
    }

    @Override
    public List<DonorPersonalInformation> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(DonorPersonalInformation.class).list();
    }

    @Override
    public CombinedCommandObject findCombinedCommandObjectByDonorId(Integer donorId) {
        CombinedCommandObject combinedCommandObject = new CombinedCommandObject();
        donorPersonalInformation = (DonorPersonalInformation) sessionFactory.getCurrentSession().get(DonorPersonalInformation.class, donorId);
        combinedCommandObject.setDonorPersonalInformation(donorPersonalInformation);
        combinedCommandObject.setDonorPreviousDonationHistory(donorPersonalInformation.getDonorPreviousDonationHistory());
        combinedCommandObject.setDonorHealthRelatedInformation(donorPersonalInformation.getDonorHealthRelatedInformation());
        combinedCommandObject.setDonorTypeAndConsent(donorPersonalInformation.getDonorTypeAndConsent());
        combinedCommandObject.setDonorTransfusionClottingFactory(donorPersonalInformation.getDonorTransfusionClottingFactory());
        combinedCommandObject.setDonorHistory(donorPersonalInformation.getDonorHistory());
        combinedCommandObject.setDonorSufferingHistory(donorPersonalInformation.getDonorSufferingHistory());
        combinedCommandObject.setQuestions(donorPersonalInformation.getQuestions());
        return combinedCommandObject;
    }

    @Override
    public DonorPersonalInformation findDonorByDonorGeneratedId(String donorGeneratedId) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(DonorPersonalInformation.class);
        criteria.add(Restrictions.eq("donorId", donorGeneratedId));
        return (DonorPersonalInformation) criteria.uniqueResult();
    }

}
