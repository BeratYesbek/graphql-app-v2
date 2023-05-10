package com.beratyesbek.modular.graphql.app.kernel.aspects;

import com.beratyesbek.modular.graphql.app.database.entities.AbstractEntity;
import com.beratyesbek.modular.graphql.app.kernel.annotations.Validation;
import com.beratyesbek.modular.graphql.app.kernel.concerns.validations.Validator;
import com.beratyesbek.modular.graphql.app.kernel.constants.AnnotationPackageConstants;
import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

@Aspect
@Configuration
public class ValidationAspect {

    @SneakyThrows
    @Before(AnnotationPackageConstants.VALIDATION_ANNOTATION_PACKAGE)
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Validation validation = method.getAnnotation(Validation.class);

        Validator validator = validation.validator().newInstance();
        for (Object arg : joinPoint.getArgs()) {
            if (arg instanceof AbstractEntity) {
                validator.validate((AbstractEntity) arg);
                break;
            }
        }
    }
}
