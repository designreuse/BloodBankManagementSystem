package com.bbms.web.services;

import com.bbms.web.dao.DonorDAO;
import com.bbms.web.models.donor.CombinedCommandObject;
import com.bbms.web.models.donor.DonorPersonalInformation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DonorServiceImpl implements DonorService {

    @Autowired
    private DonorDAO donorDao;

    @Override
    public void saveDonor(CombinedCommandObject combinedCommandObject) {
        donorDao.saveDonor(combinedCommandObject);
    }

    @Override
    public List<DonorPersonalInformation> findAll() {
        return donorDao.findAll();
    }

    @Override
    public DonorPersonalInformation findDonorById(Integer donorId) {
        return donorDao.findDonorById(donorId);
    }

    @Override
    public CombinedCommandObject findCombinedCommandObjectByDonorId(Integer donorId) {
        return donorDao.findCombinedCommandObjectByDonorId(donorId);
    }

    @Override
    public DonorPersonalInformation findDonorByDonorGeneratedId(String donorGeneratedId) {
        return donorDao.findDonorByDonorGeneratedId(donorGeneratedId);
    }

}
