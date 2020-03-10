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
    public BenefitsService(@Qualifier("fakeDao") BenefitsDao benefitsDao) {
        this.benefitsDao = benefitsDao;
    }

    public int addBenefits(Benefits benefits) {
        return benefitsDao.insertBenefits(benefits);
    }

    public List<Benefits> getAllBenefits() {
        return benefitsDao.selectAllBenefits();
    }

    public Optional<Benefits> getBenefitsByUserName(String userName) {
        return benefitsDao.selectBenefitsByUserName(userName);
    }

    public int deleteBenefits(String userName) {
        return benefitsDao.deleteBenefitsByUserName(userName);
    }

    public int updateBenefits(String userName, Benefits newBenefits) {
        return benefitsDao.updateBenefitsByUserName(userName, newBenefits);
    }
}