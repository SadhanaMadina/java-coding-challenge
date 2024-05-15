package com.java.ecommerce.main;

import java.sql.SQLException;
import java.util.List;

import com.java.ecommerce.dao.Customer;
import com.java.ecommerce.model.Customers;

public class ShowCustomers {
	public static void main(String[] args) {
		Customer c= new Customer();
		try {
			List<Customers> customerList = null;
			customerList=c.showCustomers();
			if(customerList!=null) {
			for (Customers customers : customerList) {
				System.out.println(customers);
			}
			}
		    if(customerList.size()==0) {
				System.out.println("No records");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
