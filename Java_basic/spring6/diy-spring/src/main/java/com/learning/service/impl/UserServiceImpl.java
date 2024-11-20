package com.learning.service.impl;

import com.learning.anno.Bean;
import com.learning.anno.DI;
import com.learning.dao.UserDao;
import com.learning.dao.impl.UserDaoImpl;
import com.learning.service.UserService;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  15:23
 */

@Bean
public class UserServiceImpl implements UserService {
    @DI
    private UserDaoImpl userDao;

    @Override
    public void add() {
        System.out.println("service add");
        userDao.add();
    }
}
