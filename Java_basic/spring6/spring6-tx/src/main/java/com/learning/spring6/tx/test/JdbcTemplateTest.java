package com.learning.spring6.tx.test;

import com.learning.spring6.tx.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  15:17
 */
@SpringJUnitConfig(SpringConfig.class)
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test01(){
        //添加

        String sql = "INSERT INTO t_tmp VALUES (NULL, ?,?,?)";
        int rows = jdbcTemplate.update(sql, "东方不败", 23, "未知");
        System.out.println(rows);
    }
}
