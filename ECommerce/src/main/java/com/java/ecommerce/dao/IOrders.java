package com.java.ecommerce.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.ecommerce.model.Orders;

public interface IOrders {
	List<Orders> showCustomerOrders(int customer_id) throws ClassNotFoundException, SQLException;
	String PlaceOrder(int Cust_Id,int Product_Id,int QuantityOrd) throws ClassNotFoundException, SQLException;
	int generateOrderId() throws ClassNotFoundException, SQLException;

}
