package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;

/**
 * ユーザー情報を受け取るコントローラ.
 * 
 * @author kento.taira
 *
 */
@Controller
@RequestMapping("/uic")
public class UserInfoController {

	/**
	 * 入力画面表示
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/input")
	public String input() {
		return "inputUserInfo";
	}

	/**
	 * 引数をUserドメインに入れてからスコープの中に入れて出力画面表示.
	 * 
	 * @param model
	 *            モデル
	 * @param name
	 *            名前
	 * @param age
	 *            年齢
	 * @param address
	 *            住所
	 * @return 出力画面
	 */
	@RequestMapping("/output")
	public String output(Model model, String name, String age, String address) {

		User user = new User(name, age, address);
		model.addAttribute("user", user);
		// System.out.println("aaaa");
		return "outputUserInfo";
	}
}
