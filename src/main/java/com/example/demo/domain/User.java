package com.example.demo.domain;

/**
 * ユーザ情報を表すドメイン.
 * 
 * @author kento.taira
 *
 */
public class User {
	/** 名前 */
	private String name;
	/** 年齢 */
	private String age;
	/** 住所 */
	private String address;

	public User() {
	}

	public User(String name, String age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
