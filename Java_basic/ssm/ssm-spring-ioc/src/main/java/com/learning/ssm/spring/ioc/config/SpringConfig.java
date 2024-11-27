package com.learning.ssm.spring.ioc.config;

import com.learning.ssm.spring.ioc.bean.AUUID;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/26  17:46
 */
@Configuration
//@ComponentScan("com.learning.ssm.spring") Springboot中已有(@SpringBootApplication)
public class SpringConfig {

    @Bean
    public AUUID uuid() {
        return new AUUID();
    }
}
