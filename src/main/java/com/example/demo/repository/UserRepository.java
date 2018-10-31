package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

//import javax.swing.tree.RowMapper;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

/**
 * infoテーブル操作用のリポジトリクラス.
 * 
 * @author kento.taira
 *
 */
@Repository
public class UserRepository {
	/**
	 * ResultSetオブジェクトからUserオブジェクトに変換するためのクラス実装&インスタンス化
	 */
	private static final RowMapper<User> USER_ROW_MAPPER = (rs, i) -> {
		Integer id = rs.getInt("id");
		String name = rs.getString("name");
		String age = rs.getString("age");
		String address = rs.getString("address");
		return new User(id, name, age, address);
	};

	/**
	 * NamedParameterJdbcTemplateオブジェクトを使用するための定義
	 */
	@Autowired
	private NamedParameterJdbcTemplate template;

	/**
	 * IDから1件の生徒情報を取得する.
	 * 
	 * @param id
	 *            検索したい生徒ID
	 * @return 検索された生徒情報 
	 */
	public User load(Integer id) {
		System.out.println("id = " + id);
		String sql = "select id, name, age, address from info where id = :id";

		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		User user = template.queryForObject(sql, param, USER_ROW_MAPPER);

		return user;
	}

}
