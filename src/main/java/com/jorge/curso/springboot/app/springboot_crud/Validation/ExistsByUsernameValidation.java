package com.jorge.curso.springboot.app.springboot_crud.Validation;


import org.springframework.stereotype.Component;

import com.jorge.curso.springboot.app.springboot_crud.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class ExistsByUsernameValidation implements ConstraintValidator<ExistsByUsername, String> {

    @Autowired
    private UserService service;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        return !service.existsByUsername(username);
    }
    
    
}
