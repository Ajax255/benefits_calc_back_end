package com.benefits_calc.back_end.service;

import java.util.List;

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
}