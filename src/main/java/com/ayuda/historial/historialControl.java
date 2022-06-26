package com.ayuda.historial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class historialControl {
	@GetMapping("/historial")
	public String historial( Model model) {
		model.addAttribute("pagina", "historial");
		return "index";
	}
}
