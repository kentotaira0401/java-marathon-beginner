package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author kento.taira  (Alt+Shift+J)
 *
 */
@Controller
@RequestMapping("/nameR")
public class NameReceive {

	
	/**入力画面表示
	 * 
	 * @return　入力画面
	 */
	@RequestMapping("/input")
	public String input() {
		System.out.println("input");
		return "inputName";
	}
	
	/**引数のnameをスコープの中に入れて
	 * 出力画面表示
	 * @param model
	 * @param name
	 * @return
	 */
	@RequestMapping("/output")
	public String output(Model model, String name) {
		System.out.println("output");
		model.addAttribute("name",name);
		return "outputName";
	}
	
}
