package com.client.demo.controller;

public class Product {
	private int prductId;
	private String productName;
	private double price;
	public int getPrductId() {
		return prductId;
	}
	public void setPrductId(int prductId) {
		this.prductId = prductId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int prductId, String productName, double price) {
		super();
		this.prductId = prductId;
		this.productName = productName;
		this.price = price;
	}
	public Product() {
		super();
	}
	

}
