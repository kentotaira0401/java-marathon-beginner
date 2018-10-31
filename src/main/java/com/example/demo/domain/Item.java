package com.example.demo.domain;

public class Item {

	private String name;
	private String price;
	
	
	public Item() {
		super();
	}
	public Item(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
