package com.learning.ssm.spring.ioc.bean;

import lombok.Data;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/26  18:30
 */
@Data
public class Mouse {
    private int id;
    private String name;

    public Mouse(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
