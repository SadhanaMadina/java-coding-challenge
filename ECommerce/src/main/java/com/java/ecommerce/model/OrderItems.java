package com.java.ecommerce.model;

public class OrderItems {
	private int order_item_id ;
	private int  order_id ;
	private int  product_id ;
	private int  quantity ;
	private double item_amount;
	public int getOrder_item_id() {
		return order_item_id;
	}
	public void setOrder_item_id(int order_item_id) {
		this.order_item_id = order_item_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getItem_amount() {
		return item_amount;
	}
	public void setItem_amount(double item_amount) {
		this.item_amount = item_amount;
	}
	@Override
	public String toString() {
		return "OrderItems [order_item_id=" + order_item_id + ", order_id=" + order_id + ", product_id=" + product_id
				+ ", quantity=" + quantity + ", item_amount=" + item_amount + "]";
	}
	public OrderItems(int order_item_id, int order_id, int product_id, int quantity, double item_amount) {
		this.order_item_id = order_item_id;
		this.order_id = order_id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.item_amount = item_amount;
	}
	public OrderItems() {
	
	}
	

}
