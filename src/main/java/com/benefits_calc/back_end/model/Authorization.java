package com.benefits_calc.back_end.model;

import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Authorization {

    @NotBlank
    private final String userName;
    private final String password;
    private final String name;

    public Authorization(@JsonProperty("User Name") String userName, @JsonProperty("Password") String password,
            @JsonProperty("Name") String name) {
        this.userName = userName;
        this.password = password;
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

}