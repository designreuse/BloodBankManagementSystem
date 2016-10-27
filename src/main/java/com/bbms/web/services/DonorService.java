package com.bbms.web.services;

import com.bbms.web.models.donor.CombinedCommandObject;
import com.bbms.web.models.donor.DonorPersonalInformation;
import java.util.List;

public interface DonorService {

    void saveDonor(CombinedCommandObject combinedCommandObject);

    List<DonorPersonalInformation> findAll();

    DonorPersonalInformation findDonorById(Integer donorId);

    CombinedCommandObject findCombinedCommandObjectByDonorId(Integer donorId);

    DonorPersonalInformation findDonorByDonorGeneratedId(String donorGeneratedId);
}
