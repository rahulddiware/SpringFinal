package com.rd.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface Phone {
	public String message() default "{phoneF}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
