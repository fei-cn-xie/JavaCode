package com.learning.ssm.spring.ioc.config;

import com.learning.ssm.spring.ioc.bean.Mouse;
import com.learning.ssm.spring.ioc.condition.MacEnvCondition;
import com.learning.ssm.spring.ioc.condition.WindowEnvCondition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/26  18:30
 */
@Configuration
public class MouseConfig {

    @Bean("macMouse")
    @Conditional({MacEnvCondition.class})
    public Mouse macMouse() {
        return new Mouse(1,"mac's mouse");
    }

    @Value(value = "#{'${app.name}'.toUpperCase()}")
//    @Value("${app.name}")
    private String appName;

    @Bean("windowsMouse")
    @Conditional({WindowEnvCondition.class})
    public Mouse windowMouse() {
        System.out.println(appName);
        return new Mouse(2,"window's mouse");
    }


}
