package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

/**
 * 生徒関連サービスクラス
 * 
 * @author kento.taira
 *
 */
@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	/**
	 * IDから1件の生徒情報を取得する.
	 * 
	 * @param id
	 *            検索したい生徒ID
	 * @return 検索された生徒情報 0件のときはnullが返る
	 */
	public User load(Integer id) {
		return repository.load(id);
	}

}
