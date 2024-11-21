package com.learning.spring6.resource.config;

import org.apache.logging.log4j.core.config.yaml.YamlConfiguration;
import org.apache.logging.log4j.core.config.yaml.YamlConfigurationFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/20  18:20
 */
@Configuration
@ComponentScan("com.learning.spring6.resource")
@PropertySource(value = "classpath:t.properties")

public class SpringConfig {

    @Value("${r.url}")
    private String configUrl;

    @Bean("configUrl")
    public String getConfigUrl() {
        return configUrl;
    }
}
