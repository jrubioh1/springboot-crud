package com.jorge.curso.springboot.app.springboot_crud.Validation;

import org.springframework.util.StringUtils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RequieredValidation implements ConstraintValidator<IsRequiered,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

       return StringUtils.hasText(value);

    }


}
