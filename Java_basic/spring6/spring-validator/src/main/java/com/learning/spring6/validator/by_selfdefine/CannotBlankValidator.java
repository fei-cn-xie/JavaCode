package com.learning.spring6.validator.by_selfdefine;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @Author fei
 * @Version 1.0
 * @Description TODO
 * @DATA 2024/11/21  17:19
 */
public class CannotBlankValidator implements ConstraintValidator<CannotBlank, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value != null && value.contains(" ")) {
            return false;
        }
        return true;
    }
}
