package com.jsp.beanfactory_constructorInjection;

public class Pen {
	private String brand;
	private String color;
	private int price;
	public Pen(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void print() {
		System.out.println("Pen Brand is "+ brand);
		System.out.println("Pen Color is "+ color);
		System.out.println("Pen Price is "+ price);
	}
	
	
}
