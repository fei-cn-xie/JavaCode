package com.learning.spring6.iocxml.ditest;

import java.util.Arrays;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/16  17:36
 */
public class Emp {
    private String name;
    private int age;
    private Dept dept;
    private String[] hobbies;

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void work(){
        System.out.println("employee: " + name + ":" + age + ":" + dept);
        this.dept.info();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
