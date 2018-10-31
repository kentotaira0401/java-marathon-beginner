package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/startApp")
public class StartAppController {

	@RequestMapping("/item")
	public String itemAnd(Model model) {
		
		return "Item";
	}
	
}
