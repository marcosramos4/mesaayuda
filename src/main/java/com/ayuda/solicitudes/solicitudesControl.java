package com.ayuda.solicitudes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class solicitudesControl {
	@GetMapping("/solicitudes")
	public String solicitudes( Model model) {
		model.addAttribute("pagina", "solicitudes");
		return "index";
	}
}
