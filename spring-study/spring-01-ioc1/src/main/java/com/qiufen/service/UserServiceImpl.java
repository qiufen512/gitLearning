package com.qiufen.service;

import com.qiufen.dao.UserDao;
import com.qiufen.dao.UserDaoImpl;
import com.qiufen.dao.UserDaoMysqlImpl;
import com.qiufen.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {
//        private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new UserDaoMysqlImpl();
//    private UserDao userDao = new UserDaoOracleImpl();
    private UserDao userDao;

    public void getUser() {
        userDao.getUser();
    }

    //利用set进行动态实现值的注入!
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }



}
