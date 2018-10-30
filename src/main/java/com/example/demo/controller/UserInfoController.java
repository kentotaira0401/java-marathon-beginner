package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;

@Controller
@RequestMapping("/uic")
public class UserInfoController {

	@RequestMapping("/input")
	public String input() {
		return "inputUserInfo";
	}
	@RequestMapping("/output")
	public String output(Model model,String name, String age, String address) {
		
		User user = new User(name,age,address);
		model.addAttribute("user",user);
		//System.out.println("aaaa");
		return "outputUserInfo";
	}
}
