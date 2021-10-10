package com.sunboard.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping(value="/")
	public String Hello(Model model) {
		model.addAttribute("message", "Hello world");
		return "index";
		//prefix, suffix로 index.jsp로 넘어가는거 알지?
	}
}
