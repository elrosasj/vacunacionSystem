package com.vacunacion.app;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vacunacion.dto.Afiliado;

@Controller
@SessionAttributes(value = "afiliado")
public class AfiliadoController {

//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
//		formato.setLenient(false);
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(formato, false));
//	}
	
	@RequestMapping (value = "/mostrarAfiliado")
	public String mostrarVista (Model model) {
		Afiliado afiliado = new Afiliado();
		model.addAttribute("afiliado", afiliado);
		model.addAttribute("titulo", "Formulario de registro de afiliado");
		return "formAfiliado";
	}
	
	@RequestMapping (value = "/registrar" , method = RequestMethod.POST)
	public String registrarAfiliado (@Valid Afiliado afiliado, BindingResult result, Model model) {
		model.addAttribute("afiliado", afiliado);
		model.addAttribute("titulo", "Formulario de registro de afiliado");
		return "formAfiliado";
	}
		
}
