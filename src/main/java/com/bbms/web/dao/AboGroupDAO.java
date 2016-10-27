package com.bbms.web.dao;

import com.bbms.web.models.AboGroup;
import java.util.List;

public interface AboGroupDAO {

    List<AboGroup> findAll();

    void saveAboGroup(AboGroup aboGroup);

    Integer getLastInsertId();

    String generateSampleNumber();
    
    boolean isUniqueDonor(String donorId);
}
