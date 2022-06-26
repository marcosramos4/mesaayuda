package com.ayuda.chat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class chatControl {
	@GetMapping("/chat")
	public String chat( Model model) {
		model.addAttribute("pagina", "chat");
		return "index";
	}
}
