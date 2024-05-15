package com.java.ecommerce.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.ecommerce.dao.Order;
import com.java.ecommerce.model.Orders;

public class showCustomerOrders {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id");
		int e_id=sc.nextInt();
		Order o=new Order();
		try {
			List<Orders> orderList=null;
			orderList=o.showCustomerOrders(e_id);
			if(orderList.size()==0) {
				System.out.println("Records not found");
			}
			else {
				for (Orders orders : orderList) {
					System.out.println(orders);
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
