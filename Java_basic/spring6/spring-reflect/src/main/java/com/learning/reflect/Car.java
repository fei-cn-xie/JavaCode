package com.learning.reflect;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/19  14:17
 */
public class Car {
    private String name;
    private String color;
    private int age;


    public Car() {
    }

    public Car(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }
    private void run(){
        System.out.println("私有方法run ...");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
