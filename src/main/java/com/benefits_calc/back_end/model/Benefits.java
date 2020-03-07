package com.benefits_calc.back_end.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Benefits {
    private final UUID id;
    private final String name;
    private final String employmentStatus;
    private final float hourlyRate;
    private final String baseSalary;
    private final String totalIncome;
    private final String medical;
    private final String medAmt;
    private final String dental;
    private final String dentAmt;
    private final String vision;
    private final int visnAmt;
    private final String healthSavingsAccount;
    private final int hsaAmt;
    private final String retirement;
    private final float lifeInsurance;
    private final float accidental;
    private final float longTermDisb;
    private final String medicare;
    private final String holidays;
    private final float winterLeave;
    private final String totalBenefits;
    private final String totalSalaryAndBenefits;
    private final String pctBenToSal;

    public Benefits(@JsonProperty("id") UUID id, @JsonProperty("Name") String name,
            @JsonProperty("Class") String employmentStatus, @JsonProperty("Hourly Rate") float hourlyRate,
            @JsonProperty("Base Salary") String baseSalary, @JsonProperty("Total Income") String totalIncome,
            @JsonProperty("Medical") String medical, @JsonProperty("MedAmt") String medAmt,
            @JsonProperty("Dental") String dental, @JsonProperty("DentAmt") String dentAmt,
            @JsonProperty("Vision") String vision, @JsonProperty("VisnAmt") int visnAmt,
            @JsonProperty("Health Savings Account") String healthSavingsAccount, @JsonProperty("HSA Amt") int hsaAmt,
            @JsonProperty("Retirement") String retirement, @JsonProperty("Life Insurance") float lifeInsurance,
            @JsonProperty("Accidental") float accidental, @JsonProperty("Long Term Disb") float longTermDisb,
            @JsonProperty("Medicare") String medicare, @JsonProperty("Holidays") String holidays,
            @JsonProperty("Winter Leave") float winterLeave, @JsonProperty("Total Benefits") String totalBenefits,
            @JsonProperty("Total Salary and Benefits") String totalSalaryAndBenefits,
            @JsonProperty("Pct Ben to Sal") String pctBenToSal) {
        this.id = id;
        this.name = name;
        this.employmentStatus = employmentStatus;
        this.hourlyRate = hourlyRate;
        this.baseSalary = baseSalary;
        this.totalIncome = totalIncome;
        this.medical = medical;
        this.medAmt = medAmt;
        this.dental = dental;
        this.dentAmt = dentAmt;
        this.vision = vision;
        this.visnAmt = visnAmt;
        this.healthSavingsAccount = healthSavingsAccount;
        this.hsaAmt = hsaAmt;
        this.retirement = retirement;
        this.lifeInsurance = lifeInsurance;
        this.accidental = accidental;
        this.longTermDisb = longTermDisb;
        this.medicare = medicare;
        this.holidays = holidays;
        this.winterLeave = winterLeave;
        this.totalBenefits = totalBenefits;
        this.totalSalaryAndBenefits = totalSalaryAndBenefits;
        this.pctBenToSal = pctBenToSal;
    }

    public UUID getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public String getBaseSalary() {
        return baseSalary;
    }

    public String getTotalIncome() {
        return totalIncome;
    }

    public String getMedical() {
        return medical;
    }

    public String getMedAmt() {
        return medAmt;
    }

    public String getDental() {
        return dental;
    }

    public String getDentAmt() {
        return dentAmt;
    }

    public String getVision() {
        return vision;
    }

    public int getVisnAmt() {
        return visnAmt;
    }

    public String getHealthSavingsAccount() {
        return healthSavingsAccount;
    }

    public int getHsaAmt() {
        return hsaAmt;
    }

    public String getRetirement() {
        return retirement;
    }

    public float getLifeInsurance() {
        return lifeInsurance;
    }

    public float getAccidental() {
        return accidental;
    }

    public float getLongTermDisb() {
        return longTermDisb;
    }

    public String getMedicare() {
        return medicare;
    }

    public String getHolidays() {
        return holidays;
    }

    public float getWinterLeave() {
        return winterLeave;
    }

    public String getTotalBenefits() {
        return totalBenefits;
    }

    public String getTotalSalaryAndBenefits() {
        return totalSalaryAndBenefits;
    }

    public String getPctBenToSal() {
        return pctBenToSal;
    }
}