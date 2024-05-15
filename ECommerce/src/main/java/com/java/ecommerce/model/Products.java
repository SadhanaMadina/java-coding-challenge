package com.java.ecommerce.model;

public class Products {
	private int product_id;
	private String product_name;
	private double price;
	private String descr ;
	private int stockQuantity;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price + ", descr="
				+ descr + ", stockQuantity=" + stockQuantity + "]";
	}
	public Products(int product_id, String product_name, double price, String descr, int stockQuantity) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
		this.descr = descr;
		this.stockQuantity = stockQuantity;
	}
	public Products() {
		
	}
	
}
