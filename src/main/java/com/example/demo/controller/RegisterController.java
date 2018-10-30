package com.example.demo.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 3つの商品の金額を受け取るコントローラ
 * 
 * @author kento.taira
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

	/**
	 * applicationの定義
	 */
	@Autowired
	private ServletContext application;

	/**
	 * 入力画面遷移
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/buy")
	public String buygoods() {
		return "buyGoods";
	}

	/**
	 * 3つの金額を受け取り、計算してからapplicationスコープに入れる
	 * 
	 * @param goods1
	 *            商品1の金額
	 * @param goods2
	 *            商品2の金額
	 * @param goods3
	 *            商品3の金額
	 * @return 出力画面
	 */
	@RequestMapping("/total")
	public String totalPrice(String goods1, String goods2, String goods3) {

		Integer intValueOfGoods1 = Integer.parseInt(goods1);
		Integer intValueOfGoods2 = Integer.parseInt(goods2);
		Integer intValueOfGoods3 = Integer.parseInt(goods3);

		Integer totalNum = intValueOfGoods1 + intValueOfGoods2 + intValueOfGoods3;
		Double taxNum = totalNum * 1.08;

		application.setAttribute("totalNum", totalNum);
		application.setAttribute("taxNum", taxNum);

		return "totalPrice";
	}

}
