package com.learning.dao.impl;

import com.learning.anno.Bean;
import com.learning.dao.UserDao;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  15:24
 */

@Bean
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("user dao add...");
    }
}
