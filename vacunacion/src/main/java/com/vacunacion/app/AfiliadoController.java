package com.vacunacion.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vacunacion.dto.Afiliado;

@Controller
@SessionAttributes(value = "afiliado")
public class AfiliadoController {

	
	@RequestMapping (value = "/alta")
	public String alta (Model model) {
		Afiliado afiliado = new Afiliado();
		model.addAttribute("afiliado", afiliado);
		model.addAttribute("titulo", "Vacunacion integral");
		return "index";
	}
}
