package com.learning.spring6.autowire.service;

import com.learning.spring6.autowire.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  12:37
 */

@Service
public class UserServiceImpl implements UserService {
    //注入dao
//    @Autowired
//    @Qualifier(value = "userDaoImpl")
    @Resource(name = "userDaoImpl", type = UserDao.class)
    UserDao userDao;

    @Override
    public void add() {
        System.out.println("是嫌累 Service");
        userDao.add();
    }
}
