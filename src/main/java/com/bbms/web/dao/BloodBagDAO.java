package com.bbms.web.dao;

import com.bbms.web.models.BloodBag;
import java.util.Date;
import java.util.List;

public interface BloodBagDAO {

    List<BloodBag> findAll();

    void saveBloodBag(BloodBag bloodBag);

    BloodBag findBloodBagById(Integer bloodBagId);
    
    void updateBloogBagInformationById(Integer bloodBagId, BloodBag bloodBag);
    
    Integer getLastInsertId();

    String generateBloodBagNumber();

    boolean isEligibleForDonation(String donorId, Date collectionDate);
    
    void deleteBloodBagById(Integer bloodBagId);
}
