package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 入力された数字を受け取るコントローラ.
 * 
 * @author kento.taira
 *
 */
@Controller
@RequestMapping("/Calc")
public class CalcController {

	/**
	 * 入力画面表示
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/input")
	public String input() {
		return "inputValue";
	}

	/**
	 * sessionスコープ宣言
	 */
	@Autowired
	private HttpSession session;

	/**
	 * 引数を計算し、sessionスコープに入れる
	 * 
	 * @param num1
	 *            1個目の数字
	 * @param num2
	 *            2個目の数字
	 * @param result
	 *            計算結果
	 * @return 出力画面
	 */
	@RequestMapping("/output")
	public String output(String num1, String num2) {

		Integer intValueOfNum1 = Integer.parseInt(num1);
		Integer intValueOfNum2 = Integer.parseInt(num2);
		Integer result = intValueOfNum1 * intValueOfNum2;

		session.setAttribute("num1", intValueOfNum1);
		session.setAttribute("num2", intValueOfNum2);
		session.setAttribute("result", result);

		return "outputValue";
	}

	/**
	 * @return セッション2
	 */
	@RequestMapping("/session2")
	public String output2() {
		return "outputValue2";
	}

	/**
	 * @return セッション1
	 */
	@RequestMapping("/session1")
	public String output1() {
		return "outputValue";
	}
}
