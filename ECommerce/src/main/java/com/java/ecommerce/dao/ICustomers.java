package com.java.ecommerce.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.ecommerce.model.Customers;

public interface ICustomers {
	List<Customers> showCustomers() throws ClassNotFoundException, SQLException;
	Customers SearchByCustomerId(int customer_id) throws ClassNotFoundException, SQLException;
	Customers searchByEmail(String email) throws ClassNotFoundException, SQLException;
	int authenticateCustomer(String email, String pwd) throws ClassNotFoundException, SQLException;
	void updatingpwd(String pwd,String email) throws ClassNotFoundException, SQLException;
}
