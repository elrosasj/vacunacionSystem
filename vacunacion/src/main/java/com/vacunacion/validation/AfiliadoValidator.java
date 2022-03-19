package com.vacunacion.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.vacunacion.dto.Afiliado;

/**@apiNote Validador personalizado que permite validar el objeto
 * que se pasa a la vista en el model y este es interceptado para este ejemplo 
 * con la anotacion @InitBind, valida varios campos del objeto asignado en support
 * @author ELOY
 *
 */
@Component
public class AfiliadoValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Afiliado.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Afiliado afiliado = (Afiliado) target;
		
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "codigoPostal", "");
		if (afiliado.getNombre().length()>0&&!afiliado.getNombre().matches("[A-Z]")) {
			errors.rejectValue("nombre", "patter.afiliado.only.letter");
		}
		if (afiliado.getApellidoPaterno().length()>0&&!afiliado.getApellidoPaterno().matches("[A-Z]")) {
			errors.rejectValue("apellidoPaterno", "patter.afiliado.only.letter");
		}
		if (afiliado.getApellidoMaterno().length()>0 && !afiliado.getApellidoMaterno().matches("[A-Z]")) {
			errors.rejectValue("apellidoMaterno", "patter.afiliado.only.letter");
		}
		if (afiliado.getTelefonoCelular().length()>0&&!afiliado.getTelefonoCelular().matches("[0-9]")) {
			errors.rejectValue("telefonoCelular", "patter.afiliado.only.number");
		}
		if (afiliado.getTelefonoFijo().length()>0&&!afiliado.getTelefonoFijo().matches("[0-9]")) {
			errors.rejectValue("telefonoFijo", "patter.afiliado.only.number");
		}
	}
}
