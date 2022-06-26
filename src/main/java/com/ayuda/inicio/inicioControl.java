package com.ayuda.inicio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class inicioControl {
	@GetMapping("/*")
	public String inicio( Model model) {
		model.addAttribute("pagina", "inicio");
		return "index";
	}

}
