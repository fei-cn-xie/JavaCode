package com.learning.ssm.ssmspringaop.proxy;

import com.learning.ssm.ssmspringaop.calculator.MathCalculator;
import com.learning.ssm.ssmspringaop.calculator.MathCalculatorImp;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/27  10:50
 */

public class LogProxy {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("代理对象..........");
                    System.out.println(method.getName());
                    return method.invoke(target, args);
                });
    }

}
