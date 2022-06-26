package com.ayuda.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class loginControl {


	@GetMapping("/login")
	public String login( Model model) {
		model.addAttribute("pagina", "inicio");
		return "login";
	}
}
