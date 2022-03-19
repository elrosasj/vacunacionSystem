package com.vacunacion.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @apiNote Validador ligado a una anotacion para la validacion de la CURP por
 * medio de anotacion
 * @author ELOY
 *
 */
public class CurpRegexValidator implements ConstraintValidator<CurpRegex, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		//validacion para dar como valido si esta vacio el campo y pueeda
		//entrar la validacion de vacio
		if (value.length()==0) {
			return true;
		}
		//evaluacion del campo cuando no esta vacio
		if (value.length()>0 && value.matches("\"[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}\" +\r\n"
				+ "  \"(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])\" +\r\n"
				+ "  \"[HM]{1}\" +\r\n"
				+ "  \"(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)\" +\r\n"
				+ "  \"[B-DF-HJ-NP-TV-Z]{3}\" +\r\n"
				+ "  \"[0-9A-Z]{1}[0-9]{1}$\"")) {
			return true;
		}
		return false;
	}

}
