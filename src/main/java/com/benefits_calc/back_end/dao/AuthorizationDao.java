package com.benefits_calc.back_end.dao;

import java.util.List;
import java.util.Optional;

import com.benefits_calc.back_end.model.Authorization;

public interface AuthorizationDao {

    int insertAuthorization(Authorization authorization);

    List<Authorization> selectAllAuthorizations();

    Optional<Authorization> selectAuthorizationByUserName(String userName, String password);

    int deleteAuthorizationByUserName(String userName, String password);

    int updateAuthorizationByUserName(String userName, String password, Authorization authorization);
}