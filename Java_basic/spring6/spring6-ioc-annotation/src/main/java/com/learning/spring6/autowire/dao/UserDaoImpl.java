package com.learning.spring6.autowire.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  12:36
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("是嫌累 Dao");
    }
}
