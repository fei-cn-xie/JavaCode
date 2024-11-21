package com.learning.spring6.validator.by_selfdefine;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/21  17:07
 */
@Service
@Validated
public class MyService {

    public String testMethod(@NotNull @Valid User user) {
        return user.getName();
    }
}
