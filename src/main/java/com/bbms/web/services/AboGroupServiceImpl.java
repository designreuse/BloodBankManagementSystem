package com.bbms.web.services;

import com.bbms.web.dao.AboGroupDAO;
import com.bbms.web.models.AboGroup;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AboGroupServiceImpl implements AboGroupService {

    @Autowired
    private AboGroupDAO aboGroupDao;

    @Override
    public List<AboGroup> findAll() {
        return aboGroupDao.findAll();
    }

    @Override
    public void saveAboGroup(AboGroup aboGroup) {
        aboGroupDao.saveAboGroup(aboGroup);
    }

    @Override
    public String generateSampleNumber() {
        return aboGroupDao.generateSampleNumber();
    }

    @Override
    public boolean isUniqueDonor(String donorId) {
        return aboGroupDao.isUniqueDonor(donorId);
    }

}
