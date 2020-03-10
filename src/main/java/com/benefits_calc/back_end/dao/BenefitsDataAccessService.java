package com.benefits_calc.back_end.dao;

import java.util.List;
import java.util.Optional;

import com.benefits_calc.back_end.model.Benefits;

import org.springframework.stereotype.Repository;

@Repository("postgres")
public class BenefitsDataAccessService implements BenefitsDao {

    @Override
    public int deleteBenefitsByUserName(String userName) {
        return 0;
    }

    @Override
    public int insertBenefits(Benefits benefits) {
        return 0;
    }

    @Override
    public List<Benefits> selectAllBenefits() {
        return List.of(new Benefits("FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE", 0,
                "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE",
                "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE",
                "FROM POSTGRES DATA_BASE", 0, "FROM POSTGRES DATA_BASE", 0, "FROM POSTGRES DATA_BASE", 0, 0, 0,
                "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE", 0, "FROM POSTGRES DATA_BASE",
                "FROM POSTGRES DATA_BASE", "FROM POSTGRES DATA_BASE"));
    }

    @Override
    public Optional<Benefits> selectBenefitsByUserName(String userName) {
        return Optional.empty();
    }

    @Override
    public int updateBenefitsByUserName(String userName, Benefits benefits) {
        return 0;
    }

}