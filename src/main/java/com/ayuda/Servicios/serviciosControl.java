package com.ayuda.Servicios;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class serviciosControl {

	@GetMapping("/servicios")
	public String servicios( Model model) {
		model.addAttribute("pagina", "servicios");
		return "index";
	}
}
