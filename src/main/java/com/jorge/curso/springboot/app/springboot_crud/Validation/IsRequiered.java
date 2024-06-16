package com.jorge.curso.springboot.app.springboot_crud.Validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = RequieredValidation.class)
@Retention(RetentionPolicy.RUNTIME)//momento en el que ese ejecuta la validacion de anotacion que estamos creando
@Target({ElementType.FIELD, ElementType.METHOD})//donde va a ser validad la anotacion que estamos creando
public @interface IsRequiered {

	String message() default "Es requerido usando anotaciones";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };




}
