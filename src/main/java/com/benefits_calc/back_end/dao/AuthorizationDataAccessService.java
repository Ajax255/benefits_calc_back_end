package com.benefits_calc.back_end.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.benefits_calc.back_end.model.Authorization;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository("AuthorizationDao")
public class AuthorizationDataAccessService implements AuthorizationDao {

    public AuthorizationDataAccessService() {
        initializeBenefits();
    }

    private static List<Authorization> AUTHORIZED_DATA_BASE = new ArrayList<>();

    @Override
    public int insertAuthorization(Authorization authorization) {
        AUTHORIZED_DATA_BASE.add(
                new Authorization(authorization.getUserName(), authorization.getPassword(), authorization.getName()));
        return 1;
    }

    @Override
    public List<Authorization> selectAllAuthorizations() {
        return AUTHORIZED_DATA_BASE;
    }

    @Override
    public Optional<Authorization> selectAuthorizationByUserName(String userName, String password) {
        return AUTHORIZED_DATA_BASE.stream().filter(Authorization -> Authorization.getUserName().equals(userName)
                && Authorization.getPassword().equals(password)).findFirst();
    }

    @Override
    public int deleteAuthorizationByUserName(String userName, String password) {
        Optional<Authorization> authorizationMaybe = selectAuthorizationByUserName(userName, password);
        if (!authorizationMaybe.isPresent()) {
            return 0;
        }
        AUTHORIZED_DATA_BASE.remove(authorizationMaybe.get());
        return 1;
    }

    @Override
    public int updateAuthorizationByUserName(String userName, String password, Authorization update) {
        return selectAuthorizationByUserName(userName, password).map(authorization -> {
            int indexOfAuthorizationToUpdate = AUTHORIZED_DATA_BASE.indexOf(authorization);
            if (indexOfAuthorizationToUpdate >= 0) {
                AUTHORIZED_DATA_BASE.set(indexOfAuthorizationToUpdate,
                        new Authorization(update.getUserName(), update.getPassword(), update.getName()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }

    private void initializeBenefits() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = new FileInputStream(new File(
                    "../benefits_calc_back_end/src/main/java/com/benefits_calc/back_end/data/allAuthorizedList.json"));
            TypeReference<List<Authorization>> typeReference = new TypeReference<List<Authorization>>() {
            };
            AUTHORIZED_DATA_BASE = mapper.readValue(inputStream, typeReference);

            for (Authorization b : AUTHORIZED_DATA_BASE) {
                System.out.print(b.getUserName() + ", ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}