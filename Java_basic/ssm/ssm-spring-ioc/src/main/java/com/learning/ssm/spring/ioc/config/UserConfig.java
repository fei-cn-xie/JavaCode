package com.learning.ssm.spring.ioc.config;

import com.learning.ssm.spring.ioc.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/26  20:36
 */
@Configuration
public class UserConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public User user() {
        User user = new User();
        user.setName("tom");
        user.setAge(18);
        return user;

    }
}
