package com.bbms.web.services;

import com.bbms.web.models.BloodBag;
import java.util.Date;
import java.util.List;

public interface BloodBagService {

    List<BloodBag> findAll();

    BloodBag findBloodBagById(Integer bloodBagId);
    
    void updateBloogBagInformationById(Integer bloodBagId, BloodBag bloodBag);
    
    void saveBloodBag(BloodBag bloodBag);

    String generateBloodBagNumber();

    boolean isEligibleForDonation(String donorId, Date collectionDate);
    
    void deleteBloodBagById(Integer bloodBagId);
}
