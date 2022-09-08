package com.demo.bean;

public class Product {
	private long id;
	private String name;
	private String color;
	
	public Product() {
		System.out.println("default");
	}
	
	public Product(long id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	//user defined method
	public void show() {
		
		System.out.println("id : " +id);
		System.out.println("name : " +name);
		System.out.println("color : "+color);
	}
}
