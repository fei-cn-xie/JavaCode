package com.learning.spring6.junit.junit5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  14:00
 */

@Component
public class User {
    public void sayHello() {
        System.out.println("Hello");
    }
}
