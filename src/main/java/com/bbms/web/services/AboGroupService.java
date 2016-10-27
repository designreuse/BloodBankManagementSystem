package com.bbms.web.services;

import com.bbms.web.models.AboGroup;
import java.util.List;

public interface AboGroupService {

    List<AboGroup> findAll();

    void saveAboGroup(AboGroup aboGroup);

    String generateSampleNumber();
    
    boolean isUniqueDonor(String donorId);
}
