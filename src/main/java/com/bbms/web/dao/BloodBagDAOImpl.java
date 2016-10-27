package com.bbms.web.dao;

import com.bbms.web.models.BloodBag;
import com.bbms.web.models.donor.DonorPreviousDonationHistory;
import com.bbms.web.services.DonorService;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BloodBagDAOImpl implements BloodBagDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private DonorService donorService;

    @Override
    public List<BloodBag> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(BloodBag.class).list();
    }

    @Override
    public BloodBag findBloodBagById(Integer bloodBagId) {
        return (BloodBag) sessionFactory.getCurrentSession().get(BloodBag.class, bloodBagId);
    }

    @Override
    public void saveBloodBag(BloodBag bloodBag) {
        Query query = sessionFactory.getCurrentSession().createQuery("update " + DonorPreviousDonationHistory.class.getSimpleName()
                + " set donationStatus = :donationStatus, "
                + "donationDate = :donationDate "
                + " where donorId = :donorId");
        query.setParameter("donationStatus", "Yes");
        query.setParameter("donationDate", bloodBag.getCollectionDate());
        query.setParameter("donorId", bloodBag.getDonor().getDonorId());
        query.executeUpdate();
        bloodBag.setDonorId(bloodBag.getDonor().getDonorId());
        sessionFactory.getCurrentSession().persist(bloodBag);
    }

    @Override
    public void updateBloogBagInformationById(Integer bloodBagId, BloodBag bloodBag) {
        Query queryToUpdatePreviousHistory = sessionFactory.getCurrentSession().createQuery("update " + DonorPreviousDonationHistory.class.getSimpleName()
                + " set donationStatus = :donationStatus, "
                + "donationDate = :donationDate "
                + " where donorId = :donorId");
        queryToUpdatePreviousHistory.setParameter("donationStatus", "Yes");
        queryToUpdatePreviousHistory.setParameter("donationDate", bloodBag.getCollectionDate());
        queryToUpdatePreviousHistory.setParameter("donorId", bloodBag.getDonor().getDonorId());
        queryToUpdatePreviousHistory.executeUpdate();

        Query query = sessionFactory.getCurrentSession().createQuery("update " + BloodBag.class.getSimpleName()
                + " set donorId = :donorId, "
                + "collectionDate = :collectionDate, "
                + "donor = :donor, "
                + "redCells = :redCells, "
                + "whiteCells = :whiteCells, "
                + "platelets = :platelets, "
                + "plasma = :plasma "
                + " where id = :id");
        query.setParameter("donorId", bloodBag.getDonor().getDonorId());
        query.setParameter("collectionDate", bloodBag.getCollectionDate());
        query.setParameter("donor", bloodBag.getDonor());
        query.setParameter("redCells", bloodBag.getRedCells());
        query.setParameter("whiteCells", bloodBag.getWhiteCells());
        query.setParameter("platelets", bloodBag.getPlatelets());
        query.setParameter("plasma", bloodBag.getPlasma());
        query.setParameter("id", bloodBag.getId());
        int result = query.executeUpdate();
    }

    @Override
    public Integer getLastInsertId() {
        final String sql = "SELECT max( i.id ) FROM " + BloodBag.class.getSimpleName() + " i";
        Integer lastId = (Integer) sessionFactory.getCurrentSession().createQuery(sql).uniqueResult();
        return lastId;
    }

    @Override
    public String generateBloodBagNumber() {
        int newId;
        Integer lastId = this.getLastInsertId();
        String newGeneratedString = "";

        Calendar calender = Calendar.getInstance();
        int year = calender.get(Calendar.YEAR);
        if (lastId == null) {
            return "BAG-" + year + "-000000" + 1;
        } else {
            newId = lastId + 1;
            String lengthOfId = "" + newId;
            for (int i = lengthOfId.length(); i <= 6; i++) {
                newGeneratedString += "" + 0;
            }
            newGeneratedString += newId;
            return "BAG-" + year + "-" + newGeneratedString;
        }
    }

    @Override
    public boolean isEligibleForDonation(String donorId, Date collectionDate) {

        DonorPreviousDonationHistory donorPreviousDonationHistory = donorService.findDonorByDonorGeneratedId(donorId).getDonorPreviousDonationHistory();
        String donationStatus = donorPreviousDonationHistory.getDonationStatus();
        if (donationStatus.equals("Yes")) {
            
            Calendar previousDonationTime = Calendar.getInstance();
            previousDonationTime.setTime(donorPreviousDonationHistory.getDonationDate());
            long previousDonationTimeInMillSecond = previousDonationTime.getTimeInMillis();
            
            Calendar collectionTime = Calendar.getInstance();
            collectionTime.setTime(collectionDate);
            long collectionTimeInMillSecond = collectionTime.getTimeInMillis();

            double difference = collectionTimeInMillSecond - previousDonationTimeInMillSecond;
            double threeMonthsDifferenceEquivalentMiliSecond = 7776000000.0;
            
            System.out.println("Previous Donation Time " + previousDonationTimeInMillSecond);
            System.out.println("Collection Time " + collectionTimeInMillSecond);
            System.out.println("Difference  " + difference);
            System.out.println("3 months eq time " + threeMonthsDifferenceEquivalentMiliSecond);
            
            
            if( difference > threeMonthsDifferenceEquivalentMiliSecond ) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    @Override
    public void deleteBloodBagById(Integer bloodBagId) {
        BloodBag bloodBag = (BloodBag) sessionFactory.getCurrentSession().get(BloodBag.class, bloodBagId);
        if (bloodBag != null) {
            sessionFactory.getCurrentSession().delete(bloodBag);
        }
    }

}
