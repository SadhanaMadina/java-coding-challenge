package com.java.ecommerce.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.ecommerce.dao.Order;
import com.java.ecommerce.dao.Product;

public class PlaceOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer_id");
		int cid=sc.nextInt();
		System.out.println("Enter product_id");
		int pid=sc.nextInt();
		System.out.println("Enter quantity");
		int q=sc.nextInt();
		Product p=new Product();
		try {
			boolean flag=p.available(q, pid);
			if(!flag) {
				System.out.println("Out of stock");
			}
			else {
				Order o=new Order();
				System.out.println(o.PlaceOrder(cid, pid, q));
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
