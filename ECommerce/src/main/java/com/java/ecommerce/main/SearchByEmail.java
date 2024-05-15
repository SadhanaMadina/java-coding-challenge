package com.java.ecommerce.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.ecommerce.dao.Customer;
import com.java.ecommerce.model.Customers;

public class SearchByEmail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email");
		String email=sc.next();
		Customer c= new Customer();
		 try {
			 Customers customer = null;
			customer=c.searchByEmail(email);
			if(customer!=null) {
				System.out.println(customer);
			}
			else {
				System.out.println("Record not found");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
