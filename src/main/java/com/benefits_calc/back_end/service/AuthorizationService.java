package com.benefits_calc.back_end.service;

import java.util.List;
import java.util.Optional;

import com.benefits_calc.back_end.dao.AuthorizationDao;
import com.benefits_calc.back_end.model.Authorization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationService {

    private final AuthorizationDao authorizationDao;

    @Autowired
    public AuthorizationService(@Qualifier("AuthorizationDao") AuthorizationDao authorizationDao) {
        this.authorizationDao = authorizationDao;
    }

    public int addAuthorization(Authorization authorization) {
        return authorizationDao.insertAuthorization(authorization);
    }

    public List<Authorization> getAllAuthorizations() {
        return authorizationDao.selectAllAuthorizations();
    }

    public Optional<Authorization> getAuthorizationByName(String userName, String password) {
        return authorizationDao.selectAuthorizationByUserName(userName, password);
    }

    public int deleteAuthorization(String userName, String password) {
        return authorizationDao.deleteAuthorizationByUserName(userName, password);
    }

    public int updateAuthorization(String userName, String password, Authorization newAuthorization) {
        return authorizationDao.updateAuthorizationByUserName(userName, password, newAuthorization);
    }
}