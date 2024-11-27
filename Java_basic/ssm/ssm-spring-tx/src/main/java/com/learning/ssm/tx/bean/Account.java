package com.learning.ssm.tx.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/27  15:59
 */
@Data
public class Account {
    private Integer id;
    private String username;
    private Integer age;
    private BigDecimal balance;

}
