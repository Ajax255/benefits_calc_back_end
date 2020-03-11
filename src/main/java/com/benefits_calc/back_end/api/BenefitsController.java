package com.benefits_calc.back_end.api;

import java.util.List;

import javax.validation.Valid;

import com.benefits_calc.back_end.model.Benefits;
import com.benefits_calc.back_end.service.BenefitsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("api/v1/benefits")
@RestController
public class BenefitsController {

    private final BenefitsService benefitsService;

    @Autowired
    public BenefitsController(BenefitsService benefitsService) {
        this.benefitsService = benefitsService;
    }

    @PostMapping
    public void addBenefits(@Valid @NonNull @RequestBody Benefits benefits) {
        benefitsService.addBenefits(benefits);
    }

    @GetMapping
    public List<Benefits> getAllBenefits() {
        return benefitsService.getAllBenefits();
    }

    @GetMapping(path = "{name}")
    public Benefits getBenefitsByName(@PathVariable("name") String name) {
        return benefitsService.getBenefitsByName(name).orElse(null);
    }

    @DeleteMapping(path = "{name}")
    public void deleteBenefitsByName(@PathVariable("name") String name) {
        benefitsService.deleteBenefits(name);
    }

    @PutMapping(path = "{name}")
    public void updateBenefits(@PathVariable("name") String name,
            @Valid @NonNull @RequestBody Benefits benefitsToUpdate) {
        benefitsService.updateBenefits(name, benefitsToUpdate);
    }
}