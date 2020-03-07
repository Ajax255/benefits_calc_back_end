package com.benefits_calc.back_end.api;

import java.util.List;

import com.benefits_calc.back_end.model.Benefits;
import com.benefits_calc.back_end.service.BenefitsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/benefits")
@RestController
public class BenefitsController {

    private final BenefitsService benefitsService;

    @Autowired
    public BenefitsController(BenefitsService benefitsService) {
        this.benefitsService = benefitsService;
    }

    @PostMapping
    public void addBenefits(@RequestBody Benefits benefits) {
        benefitsService.addBenefits(benefits);
    }

    @GetMapping
    public List<Benefits> getAllBenefits() {
        return benefitsService.getAllBenefits();
    }
}