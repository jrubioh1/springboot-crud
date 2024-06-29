package com.jorge.curso.springboot.app.springboot_crud.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jorge.curso.springboot.app.springboot_crud.servicies.IProductService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class IsExistsValidation implements ConstraintValidator<IsExistsDb, String>{

    @Autowired
    private IProductService service; 

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if(service == null){return true;}
        
        return !service.existsBySku(value);
    }

}
