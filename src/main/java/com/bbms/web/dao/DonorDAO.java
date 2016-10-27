package com.bbms.web.dao;

import com.bbms.web.models.donor.CombinedCommandObject;
import com.bbms.web.models.donor.DonorPersonalInformation;
import java.util.List;

public interface DonorDAO {

    List<DonorPersonalInformation> findAll();

    void saveDonor(CombinedCommandObject combinedCommandObject);

    Integer getLastInsertId();

    String generateDonorId();

    DonorPersonalInformation findDonorById(Integer donorId);
    
    CombinedCommandObject findCombinedCommandObjectByDonorId(Integer donorId);
    
    DonorPersonalInformation findDonorByDonorGeneratedId(String donorGeneratedId);
}
