package com.beratyesbek.modular.graphql.app.kernel.annotations;

import com.beratyesbek.modular.graphql.app.kernel.concerns.validations.Validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Validation {
    Class<? extends Validator> validator();
}
