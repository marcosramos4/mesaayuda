package com.ayuda.Eventos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class evventosControl {
	@GetMapping("/eventos")
	public String eventos( Model model) {
		model.addAttribute("pagina", "eventos");
		return "index";
	}
}
