package com.learning.spring6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  13:22
 */
@Configuration //表示此类为配置类
@ComponentScan("com.learning.spring6.autowire") //开启组件扫描
// 等于xml中的配置“<context:component-scan base-package="com.learning.spring6"/>”
public class SpringConfig {

}
