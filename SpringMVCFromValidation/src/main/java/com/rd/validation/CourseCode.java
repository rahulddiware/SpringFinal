package com.rd.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = CourseCourseValidatior.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface CourseCode {
	// define default course code
	public String value() default "NIT";

	// define default error message
	public String message() default "Must Be start with NIT";

	// define default group
	public Class<?>[] groups() default {};

	// define default payLoads
	public Class<? extends Payload>[] payload() default {};
}
