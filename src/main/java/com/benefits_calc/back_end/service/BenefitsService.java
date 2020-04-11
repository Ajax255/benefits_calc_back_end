package com.benefits_calc.back_end.service;

import java.util.List;
import java.util.Optional;

import com.benefits_calc.back_end.dao.BenefitsDao;
import com.benefits_calc.back_end.model.Benefits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BenefitsService {

    private final BenefitsDao benefitsDao;

    @Autowired
    public BenefitsService(@Qualifier("BenefitsDao") BenefitsDao benefitsDao) {
        this.benefitsDao = benefitsDao;
    }

    public int addBenefits(Benefits benefits) {
        return benefitsDao.insertBenefits(benefits);
    }

    public List<Benefits> getAllBenefits() {
        return benefitsDao.selectAllBenefits();
    }

    public Optional<Benefits> getBenefitsByID(String id) {
        return benefitsDao.selectBenefitsByID(id);
    }

    public int deleteBenefits(String id) {
        return benefitsDao.deleteBenefitsByID(id);
    }

    public int updateBenefits(String id, Benefits newBenefits) {
        return benefitsDao.updateBenefitsByID(id, newBenefits);
    }
}