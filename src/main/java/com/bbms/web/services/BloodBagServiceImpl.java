package com.bbms.web.services;

import com.bbms.web.dao.BloodBagDAO;
import com.bbms.web.models.BloodBag;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BloodBagServiceImpl implements BloodBagService {
    
    @Autowired
    private BloodBagDAO bloodBagDao;
    
    @Override
    public List<BloodBag> findAll() {
        return bloodBagDao.findAll();
    }
    
    @Override
    public void saveBloodBag(BloodBag bloodBag) {
        bloodBagDao.saveBloodBag(bloodBag);
    }
    
    @Override
    public void updateBloogBagInformationById(Integer bloodBagId, BloodBag bloodBag) {
        bloodBagDao.updateBloogBagInformationById(bloodBagId, bloodBag);
    }
    
    @Override
    public BloodBag findBloodBagById(Integer bloodBagId) {
        return bloodBagDao.findBloodBagById(bloodBagId);
    }
    
    @Override
    public String generateBloodBagNumber() {
        return bloodBagDao.generateBloodBagNumber();
    }
    
    @Override
    public boolean isEligibleForDonation(String donorId, Date collectionDate) {
        return bloodBagDao.isEligibleForDonation(donorId, collectionDate);
    }

    @Override
    public void deleteBloodBagById(Integer bloodBagId) {
        bloodBagDao.deleteBloodBagById(bloodBagId);
    }
    
}
