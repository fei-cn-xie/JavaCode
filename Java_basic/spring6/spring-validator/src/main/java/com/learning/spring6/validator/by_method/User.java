package com.learning.spring6.validator.by_method;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.lang.NonNull;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/21  17:02
 */
public class User {

    @NotNull
    private String name;

    @Max(150)
    @Min(0)
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
