package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

/**
 * 生徒関連処理を行うコントローラ 画面から生徒IDを受け取る
 * 
 * @author kento.taira
 *
 */
@Controller
@Transactional 
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private UserService service;

	/**
	 * 初期表示.
	 * 
	 * @return Id入力画面
	 */
	@RequestMapping("/userSearch")
	public String userInfo() {
		return "userInfoSearch";
	}

	/**
	 * 入力されたIDを受け取り、その情報を元にloadする loadした情報をrequestスコープに入れて出力画面に返す
	 * 
	 * @param model
	 *            モデル
	 * @param id
	 *            生徒ID
	 * @return 生徒情報出力画面
	 */
	@RequestMapping("/userView")
	public String userInfoView(Model model, Integer id) {
		User user = service.load(id);
		//model.addAllAttributes("user",user);と、まとめてもよし
		model.addAttribute("id", user.getId());
		model.addAttribute("name", user.getName());
		model.addAttribute("age", user.getAge());
		model.addAttribute("address", user.getAddress());

		return "userInfoView";
	}

}
