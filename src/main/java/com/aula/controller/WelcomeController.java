package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {	
	
	@RequestMapping(value = "/listarTodosProdutos", method = RequestMethod.GET)
	public String listarTodosProdutos (Model model) {
		return "listarTodosProdutos";
	}
	
}