package com.benefits_calc.back_end.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    @Override
    public Optional<Benefits> selectBenefitsById(UUID id) {
        return DATA_BASE.stream().filter(Benefits -> Benefits.getID().equals(id)).findFirst();
    }

    @Override
    public int deleteBenefitsById(UUID id) {
        Optional<Benefits> benefitsMaybe = selectBenefitsById(id);
        if (benefitsMaybe.isEmpty()) {
            return 0;
        }
        DATA_BASE.remove(benefitsMaybe.get());
        return 1;
    }

    @Override
    public int updateBenefitsById(UUID id, Benefits update) {
        return selectBenefitsById(id).map(Benefits -> {
            int indexOfBenefitsToUpdate = DATA_BASE.indexOf(Benefits);
            if (indexOfBenefitsToUpdate >= 0) {
                DATA_BASE.set(indexOfBenefitsToUpdate, new Benefits(id, update.getName(), update.getEmploymentStatus(),
                        update.getHourlyRate(), update.getBaseSalary(), update.getTotalIncome(), update.getMedical(),
                        update.getMedAmt(), update.getDental(), update.getDentAmt(), update.getVision(),
                        update.getVisnAmt(), update.getHealthSavingsAccount(), update.getHsaAmt(),
                        update.getRetirement(), update.getLifeInsurance(), update.getAccidental(),
                        update.getLongTermDisb(), update.getMedicare(), update.getHolidays(), update.getWinterLeave(),
                        update.getTotalBenefits(), update.getTotalSalaryAndBenefits(), update.getPctBenToSal()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }

}