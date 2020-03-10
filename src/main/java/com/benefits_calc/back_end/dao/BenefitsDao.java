package com.benefits_calc.back_end.dao;

import java.util.List;
import java.util.Optional;

import com.benefits_calc.back_end.model.Benefits;

public interface BenefitsDao {

    int insertBenefits(Benefits benefits);

    List<Benefits> selectAllBenefits();

    Optional<Benefits> selectBenefitsByUserName(String userName);

    int deleteBenefitsByUserName(String userName);

    int updateBenefitsByUserName(String userName, Benefits benefits);
}