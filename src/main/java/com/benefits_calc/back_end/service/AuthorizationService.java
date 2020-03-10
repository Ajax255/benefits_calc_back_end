// package com.benefits_calc.back_end.service;

// import java.util.List;
// import java.util.Optional;

// import com.benefits_calc.back_end.dao.AuthorizationDao;
// import com.benefits_calc.back_end.model.Authorization;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.stereotype.Service;

// @Service
// public class AuthorizationService {

//     private final AuthorizationDao authorizationDao;

//     @Autowired
//     public AuthoizationService(@Qualifier("AuthorizationDao") AuthoizationDao authorizationDao) {
//         this.authorizationDao = authorizationDao;
//     }

//     public int addAuthorization(Authorization authorizationDao) {
//         return authorizationDao.insertAuthorization(authorizationDao);
//     }

//     public List<AuthorizationDao> getAllAuthorization() {
//         return authorizationDao.selectAllAuthorization();
//     }

//     public Optional<AuthorizationDao> getAuthorizationByName(String userName, String password) {
//         return authorizationDao.selectAuthorizationByName(userName, password);
//     }

//     public int deleteAuthorization(String userName, String password) {
//         return authorizationDao.deleteAuthorizationByName(userName, password);
//     }

//     public int updateAuthorization(String name, AuthorizationDao newAuthorizationDao) {
//         return authorizationDao.updateAuthorizationsByName(userName, password, newAuthorizationDao);
//     }
// }