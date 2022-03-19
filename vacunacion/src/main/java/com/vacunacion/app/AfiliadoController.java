package com.vacunacion.app;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vacunacion.dto.Afiliado;
import com.vacunacion.validation.AfiliadoValidator;

@Controller
@SessionAttributes(value = "afiliado")
@RequestMapping(value = "/afiliado")
public class AfiliadoController {

	@Autowired private AfiliadoValidator usuarioValidator;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(usuarioValidator);//validacion por anotacion interceptor automatico
//		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
//		formato.setLenient(false);
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(formato, false));
	}
	
	@RequestMapping (value = "/form")
	public String mostrarVista (Model model) {
		Afiliado afiliado = new Afiliado();
		model.addAttribute("afiliado", afiliado);
		model.addAttribute("titulo", "Formulario de registro de afiliado");
		return "formAfiliado";
	}
	
	@RequestMapping (value = "/form" , method = RequestMethod.POST)
	public String registrarAfiliado (@Valid Afiliado afiliado, BindingResult result, Model model) {
//		usuarioValidator.validate(afiliado, result);//validacion de manera explicita
		model.addAttribute("afiliado", afiliado);
		model.addAttribute("titulo", "Formulario de registro de afiliado");
		return "formAfiliado";
	}
	
	@RequestMapping (value = "/listar")
	public String listarAfiliados (Model model) {
		List lista = Arrays.asList(
				new Afiliado(1L, "Eloy", "Rosas", "Jinez", "H", new Date(), "ROJE900818HMSSNL07", "XXXXX", "YYYYYY", "345345353", "3453453453453", new Date()),
				new Afiliado(2L, "Eloy", "Jinez", "Jinez", "H", new Date(), "ROJE900818HMSSNL07", "XXXXX", "YYYYYY", "345345353", "3453453453453", new Date())
);
		model.addAttribute("titulo", "Afiliados registrados");
		model.addAttribute("afiliados", lista);
		return "listarAfiliados";
	}
}
