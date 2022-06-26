package com.ayuda.consultas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class consultaControl {
	@GetMapping("/consultas")
	public String consultas( Model model) {
		model.addAttribute("pagina", "consultas");
		return "index";
	}
}
