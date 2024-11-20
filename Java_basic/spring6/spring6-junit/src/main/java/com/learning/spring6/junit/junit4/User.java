package com.learning.spring6.junit.junit4;

import org.springframework.stereotype.Component;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  14:17
 */

@Component(value = "user1")
public class User {
    public void sayHello() {
        System.out.println("Hello World");
    }
}
