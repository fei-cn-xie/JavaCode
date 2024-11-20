package com.learning.spring6.iocxml.auto.service;

import com.learning.spring6.iocxml.auto.dao.UserDao;
import com.learning.spring6.iocxml.auto.dao.UserDaoImpl;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/18  19:32
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        userDao.addUser();
        System.out.println("User add Service...");
    }
}
