package com.learning.mvc.controller;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/23  09:58
 */
public class User {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
