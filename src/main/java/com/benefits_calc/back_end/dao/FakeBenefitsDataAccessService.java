package com.benefits_calc.back_end.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.benefits_calc.back_end.model.Benefits;

import org.springframework.stereotype.Repository;

@Repository("fakeDao")
public class FakeBenefitsDataAccessService implements BenefitsDao {

    private static List<Benefits> DATA_BASE = new ArrayList<>();

    @Override
    public int insertBenefits(UUID id, Benefits benefits) {
        DATA_BASE.add(new Benefits(id, benefits.getName(), benefits.getEmploymentStatus(), benefits.getHourlyRate(),
                benefits.getBaseSalary(), benefits.getTotalIncome(), benefits.getMedical(), benefits.getMedAmt(),
                benefits.getDental(), benefits.getDentAmt(), benefits.getVision(), benefits.getVisnAmt(),
                benefits.getHealthSavingsAccount(), benefits.getHsaAmt(), benefits.getRetirement(),
                benefits.getLifeInsurance(), benefits.getAccidental(), benefits.getLongTermDisb(),
                benefits.getMedicare(), benefits.getHolidays(), benefits.getWinterLeave(), benefits.getTotalBenefits(),
                benefits.getTotalSalaryAndBenefits(), benefits.getPctBenToSal()));
        return 1;
    }

    @Override
    public List<Benefits> selectAllBenefits() {
        return DATA_BASE;
    }

}