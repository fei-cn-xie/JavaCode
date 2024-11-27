package com.learning.ssm.spring.ioc.factory;

import com.learning.ssm.spring.ioc.bean.Car;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * Author fei
 * Version 1.0
 * Description 创建复杂对象, 比如需要数据库数据时、需要用户访问时创建等, 可以使用FactoryBean的实现类来创建Bean
 * DATA 2024/11/26  18:14
 */
@Component
public class BYD implements FactoryBean<Car>{

    /**
     * Spring调用此方法给ioc容器创建对象
     * @return
     * @throws Exception
     */
    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
