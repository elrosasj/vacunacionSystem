package com.vacunacion.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**@apiNote
 * Anotacion personalizda ligada a un validador personalizado
 * que evalua la estructura de la CURP
 * @author ELOY
 *
 */
@Constraint(validatedBy = {CurpRegexValidator.class })
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface CurpRegex {
	String message() default "Campo invalido";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
