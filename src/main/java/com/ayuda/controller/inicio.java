package com.ayuda.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class inicio {
	

	@GetMapping("/*")
	public String inicio( Model model) {
		model.addAttribute("pagina", "inicio");
		return "index";
	}
	
	@GetMapping("/solicitudes")
	public String solicitudes( Model model) {
		model.addAttribute("pagina", "solicitudes");
		return "index";
	}
	
	
	@GetMapping("/login")
	public String login( Model model) {
		model.addAttribute("pagina", "inicio");
		return "login";
	}
	@GetMapping("/consultas")
	public String consultas( Model model) {
		model.addAttribute("pagina", "consultas");
		return "index";
	}
	@GetMapping("/servicios")
	public String servicios( Model model) {
		model.addAttribute("pagina", "servicios");
		return "index";
	}
	@GetMapping("/reportes")
	public String reportes( Model model) {
		model.addAttribute("pagina", "reportes");
		return "index";
	}
	@GetMapping("/historial")
	public String historial( Model model) {
		model.addAttribute("pagina", "historial");
		return "index";
	}
	@GetMapping("/eventos")
	public String eventos( Model model) {
		model.addAttribute("pagina", "eventos");
		return "index";
	}
	@GetMapping("/chat")
	public String chat( Model model) {
		model.addAttribute("pagina", "chat");
		return "index";
	}

}
