package com.benefits_calc.back_end.api;

import java.util.List;

import javax.validation.Valid;

import com.benefits_calc.back_end.model.Authorization;
import com.benefits_calc.back_end.service.AuthorizationService;

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
@RequestMapping("api/v1/authorization")
@RestController
public class AuthorizationController {

    private final AuthorizationService authorizationService;

    @Autowired
    public AuthorizationController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @PostMapping
    public void addAuthorization(@Valid @NonNull @RequestBody Authorization authorization) {
        authorizationService.addAuthorization(authorization);
    }

    @GetMapping
    public List<Authorization> getAllAuthorizations() {
        return authorizationService.getAllAuthorizations();
    }

    @GetMapping(path = "{user name}/{password}")
    public String getAuthorizationByUserName(@PathVariable("user name") String userName,
            @PathVariable("password") String password) {
        return authorizationService.getAuthorizationByName(userName, password).orElse(null).getName();
    }

    @DeleteMapping(path = "{user name}/{password}")
    public void deleteAuthorizationByUserName(@PathVariable("user name") String userName,
            @PathVariable("password") String password) {
        authorizationService.deleteAuthorization(userName, password);
    }

    @PutMapping(path = "{user name}/{password}")
    public void updateAuthorization(@PathVariable("user name") String name, @PathVariable("password") String password,
            @Valid @NonNull @RequestBody Authorization authorizationToUpdate) {
        authorizationService.updateAuthorization(name, password, authorizationToUpdate);
    }
}