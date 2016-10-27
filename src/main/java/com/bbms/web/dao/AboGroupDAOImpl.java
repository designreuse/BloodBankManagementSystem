package com.bbms.web.dao;

import com.bbms.web.models.AboGroup;
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
public class AboGroupDAOImpl implements AboGroupDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<AboGroup> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(AboGroup.class).list();
    }

    @Override
    public void saveAboGroup(AboGroup aboGroup) {
        aboGroup.setDonorId(aboGroup.getDonor().getDonorId());
        sessionFactory.getCurrentSession().persist(aboGroup);
    }

    @Override
    public Integer getLastInsertId() {
        final String sql = "SELECT max( i.id ) FROM " + AboGroup.class.getSimpleName() + " i";
        Integer lastId = (Integer) sessionFactory.getCurrentSession().createQuery(sql).uniqueResult();
        return lastId;
    }

    @Override
    public String generateSampleNumber() {
        int newId;
        Integer lastId = this.getLastInsertId();
        String newGeneratedString = "";
        Calendar calender = Calendar.getInstance();
        int year = calender.get(Calendar.YEAR);
        if (lastId == null) {
            return "SAMPLE-" + year + "-000000" + 1;
        } else {
            newId = lastId + 1;
            String lengthOfId = "" + newId;
            for (int i = lengthOfId.length(); i <= 6; i++) {
                newGeneratedString += "" + 0;
            }
            newGeneratedString += newId;
            return "SAMPLE-" + year + "-" + newGeneratedString;
        }
    }

    @Override
    public boolean isUniqueDonor(String donorId) {
        boolean result = true;
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(AboGroup.class);
        criteria.add(Restrictions.eq("donorId", donorId));
        AboGroup aboGroup = (AboGroup) criteria.uniqueResult();
        if (aboGroup != null) {
            result = false;
        }
        return result;
    }

}
