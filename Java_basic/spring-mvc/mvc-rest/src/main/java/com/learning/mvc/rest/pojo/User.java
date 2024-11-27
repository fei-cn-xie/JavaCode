package com.learning.mvc.rest.pojo;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/24  19:21
 */
public class User {
    private String username;
    private int age;

    public User(String username, int age) {
        this.age = age;
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + username + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
