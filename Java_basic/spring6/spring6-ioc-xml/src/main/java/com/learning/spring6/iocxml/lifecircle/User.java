package com.learning.spring6.iocxml.lifecircle;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/18  18:53
 */
public class User {
    private String name;

    //无参数构造, bean初始化时调用
    public User(){
        System.out.println("1. bean对象创建, 调用无参数构造");
    }

    //bean初始化方法
    //方法名随便起
    public void initMethod(){
        System.out.println("4. bean对象初始化(调用指定的初始化方法)");
    }

    //bean销毁方法
    public void destroyMethod(){
        System.out.println("7. bean对象销毁(配置指定的销毁方法)");
    }

    public String getName() {
        System.out.println("6. bean对象创建完成, 使用bean");
        return name;
    }

    public void setName(String name) {
        System.out.println("2. 给bean对象设置相关属性");
        this.name = name;
    }
}
