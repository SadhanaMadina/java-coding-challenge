package com.java.ecommerce.main;
import java.sql.SQLException;
import java.util.Scanner;


import com.java.ecommerce.dao.Customer;

public class CustomerAuthentication {
	public static void main(String[] args) {
		String email, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email  ");
		email = sc.next();
		System.out.println("Enter Password   ");
		pwd = sc.next();
		Customer c = new Customer();
		try {
			int count = c.authenticateCustomer(email, pwd);
			if (count==1) {
				System.out.println("Correct Credentials...");
			} else {
				System.out.println("Invalid Credentials...");
			}
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
