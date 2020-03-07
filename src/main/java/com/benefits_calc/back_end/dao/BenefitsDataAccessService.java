package com.benefits_calc.back_end.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.benefits_calc.back_end.model.Benefits;

import org.springframework.stereotype.Repository;

@Repository("postgres")
public class BenefitsDataAccessService implements BenefitsDao {

    @Override
    public int deleteBenefitsById(UUID id) {
        return 0;
    }

    @Override
    public int insertBenefits(UUID id, Benefits benefits) {
        return 0;
    }

    @Override
    public List<Benefits> selectAllBenefits() {
        return List.of(new Benefits(UUID.randomUUID(), "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE", 0,
                "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE",
                "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE",
                "FROM POSTGRES DATA_BASE", 0, "FROM POSTGRES DATA_BASE", 0, "FROM POSTGRES DATA_BASE", 0, 0, 0,
                "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE", 0, "FROM POSTGRES DATA_BASE",
                "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE"));
    }

    @Override
    public Optional<Benefits> selectBenefitsById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int updateBenefitsById(UUID id, Benefits benefits) {
        return 0;
    }

}