package com.ayuda.reportes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class reportesControl {
	@GetMapping("/reportes")
	public String reportes( Model model) {
		model.addAttribute("pagina", "reportes");
		return "index";
	}
	
}
