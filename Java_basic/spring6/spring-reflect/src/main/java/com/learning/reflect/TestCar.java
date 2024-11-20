package com.learning.reflect;

import org.junit.jupiter.api.Test;
import org.springframework.lang.Nullable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  14:23
 */
public class TestCar {
    //1. 获取Class对象
    @Test
    public void test01() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1 类名.class

        Class<Car> carClass = Car.class;

        //2. 对象.getClass()
        Car car = new Car();
        Class<? extends Car> aClass = car.getClass();

        //3. Class.forName("类的全路径")
        Class<?> aClass1 = Class.forName("com.learning.reflect.Car");

        //实例化
        Car car1 = (Car)carClass.getDeclaredConstructor().newInstance();
        System.out.println(car1);
    }


    //2. 获取构造方法

    @Test
    public void test02() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Car> carClass = Car.class;
        //获取所有构造
        Constructor<?>[] constructors = carClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getParameterCount());
        }

        //获取公有无参构造
        Constructor<Car> constructor = carClass.getConstructor();
        System.out.println(constructor.getParameterCount());

        //指定公有的有参数构造
        Constructor<Car> constructor1 = carClass.getConstructor(int.class, String.class, String.class);
        Car car = constructor1.newInstance(10,"Orange","XIAOMI");
        System.out.println(car);

        //获取任何有参构造
        //指定有参数构造
        Constructor<Car> constructor2 = carClass.getDeclaredConstructor(int.class, String.class, String.class);
        Car car2 = constructor1.newInstance(10,"Orange","XIAOMI");
        System.out.println(car2);
    }




    //3. 获取属性
    @Test
    public void test03() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Car> carClass = Car.class;
        Car car = carClass.getDeclaredConstructor().newInstance();
        Field name = carClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(car,"XIAOMI UTR");
        System.out.println(name);
        Field age = carClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(car,3);

        Field color = carClass.getDeclaredField("color");
        color.setAccessible(true);
        color.set(car, "ORANGE");


        System.out.println(car);
    }


    //4. 获取方法

    @Test
    public void test04() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Car> carClass = Car.class;
        Car car = carClass.getDeclaredConstructor().newInstance();

        Method setName = carClass.getDeclaredMethod("setName", String.class);
        setName.setAccessible(true);
        setName.invoke(car,"SAILISI");

        Method setAge = carClass.getDeclaredMethod("setAge", int.class);
        setAge.setAccessible(true);
        setAge.invoke(car,9);

        Method setColor = carClass.getDeclaredMethod("setColor", String.class);
        setColor.setAccessible(true);
        setColor.invoke(car,"BLACK");


        System.out.println(car);

    }
}
