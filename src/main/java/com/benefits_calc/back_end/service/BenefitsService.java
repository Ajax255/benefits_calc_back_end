package com.benefits_calc.back_end.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.benefits_calc.back_end.dao.BenefitsDao;
import com.benefits_calc.back_end.model.Benefits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BenefitsService {

    private final BenefitsDao benefitsDao;

    @Autowired
    public BenefitsService(@Qualifier("fakeDao") BenefitsDao benefitsDao) {
        this.benefitsDao = benefitsDao;
    }

    public int addBenefits(Benefits benefits) {
        return benefitsDao.insertBenefits(benefits);
    }

    public List<Benefits> getAllBenefits() {
        return benefitsDao.selectAllBenefits();
    }

    public Optional<Benefits> getBenefitsById(UUID id) {
        return benefitsDao.selectBenefitsById(id);
    }

    public int deleteBenefits(UUID id) {
        return benefitsDao.deleteBenefitsById(id);
    }

    public int updateBenefits(UUID id, Benefits newBenefits) {
        return benefitsDao.updateBenefitsById(id, newBenefits);
    }
}