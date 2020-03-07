package com.benefits_calc.back_end.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.benefits_calc.back_end.model.Benefits;

public interface BenefitsDao {

    int insertBenefits(UUID id, Benefits benefits);

    default int insertBenefits(Benefits benefits) {
        UUID id = UUID.randomUUID();
        return insertBenefits(id, benefits);
    }

    List<Benefits> selectAllBenefits();

    Optional<Benefits> selectBenefitsById(UUID id);

    int deleteBenefitsById(UUID id);

    int updateBenefitsById(UUID id, Benefits benefits);
}