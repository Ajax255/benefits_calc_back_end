package com.benefits_calc.back_end.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.benefits_calc.back_end.model.Benefits;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository("BenefitsDao")
public class BenefitsDataAccessService implements BenefitsDao {

    public BenefitsDataAccessService() {
        initializeBenefits();
    }

    private static List<Benefits> DATA_BASE = new ArrayList<>();

    @Override
    public int insertBenefits(Benefits benefits) {
        DATA_BASE.add(new Benefits(benefits.getID(), benefits.getName(), benefits.getEmploymentStatus(),
                benefits.getHourlyRate(), benefits.getBaseSalary(), benefits.getTotalIncome(), benefits.getMedical(),
                benefits.getMedAmt(), benefits.getDental(), benefits.getDentAmt(), benefits.getVision(),
                benefits.getVisnAmt(), benefits.getHealthSavingsAccount(), benefits.getHsaAmt(),
                benefits.getRetirement(), benefits.getLifeInsurance(), benefits.getAccidental(),
                benefits.getLongTermDisb(), benefits.getMedicare(), benefits.getHolidays(), benefits.getWinterLeave(),
                benefits.getTotalBenefits(), benefits.getTotalSalaryAndBenefits(), benefits.getPctBenToSal()));
        return 1;
    }

    @Override
    public List<Benefits> selectAllBenefits() {
        return DATA_BASE;
    }

    @Override
    public Optional<Benefits> selectBenefitsByID(String id) {
        return DATA_BASE.stream().filter(Benefits -> Benefits.getID().equals(id)).findFirst();
    }

    @Override
    public int deleteBenefitsByID(String id) {
        Optional<Benefits> benefitsMaybe = selectBenefitsByID(id);
        if (!benefitsMaybe.isPresent()) {
            return 0;
        }
        DATA_BASE.remove(benefitsMaybe.get());
        return 1;
    }

    @Override
    public int updateBenefitsByID(String id, Benefits update) {
        return selectBenefitsByID(id).map(Benefits -> {
            int indexOfBenefitsToUpdate = DATA_BASE.indexOf(Benefits);
            if (indexOfBenefitsToUpdate >= 0) {
                DATA_BASE.set(indexOfBenefitsToUpdate, new Benefits(update.getID(), update.getName(),
                        update.getEmploymentStatus(), update.getHourlyRate(), update.getBaseSalary(),
                        update.getTotalIncome(), update.getMedical(), update.getMedAmt(), update.getDental(),
                        update.getDentAmt(), update.getVision(), update.getVisnAmt(), update.getHealthSavingsAccount(),
                        update.getHsaAmt(), update.getRetirement(), update.getLifeInsurance(), update.getAccidental(),
                        update.getLongTermDisb(), update.getMedicare(), update.getHolidays(), update.getWinterLeave(),
                        update.getTotalBenefits(), update.getTotalSalaryAndBenefits(), update.getPctBenToSal()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }

    private void initializeBenefits() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            // Change path on different machines
            InputStream inputStream = new FileInputStream(new File(
                    "../benefits_calc_back_end/src/main/java/com/benefits_calc/back_end/data/allBenefitsList.json"));
            TypeReference<List<Benefits>> typeReference = new TypeReference<List<Benefits>>() {
            };
            DATA_BASE = mapper.readValue(inputStream, typeReference);

            for (Benefits b : DATA_BASE) {
                // System.out.print(b.getID() + ", ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}