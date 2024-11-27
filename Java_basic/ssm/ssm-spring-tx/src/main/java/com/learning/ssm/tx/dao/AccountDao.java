package com.learning.ssm.tx.dao;

import com.learning.ssm.tx.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/27  16:03
 */
@Repository
public class AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 按照username扣减余额
     * @param username 用户名
     * @param delta 扣减的费用
     */
    public void updateBalanceByUsername(String username, BigDecimal delta) {
        String sql = "update account set balance = balance - ? where username = ?";
        jdbcTemplate.update(sql, delta, username);

    }

    /**
     * 查询所有账户
     * @return 所有账户信息
     */
    public List<Account> findAccounts(){
        String sql = "select * from account";
        List<Account> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Account.class));
        return query;
    }
}
