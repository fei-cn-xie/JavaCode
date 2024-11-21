package com.learning.spring6.validator.by_method;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.lang.NonNull;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/21  17:02
 */
public class User {

    @NonNull
    private String name;

    @Max(200)
    @Min(0)
    private int age;





}
