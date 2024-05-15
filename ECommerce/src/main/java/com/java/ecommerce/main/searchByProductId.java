package com.java.ecommerce.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.ecommerce.dao.Product;
import com.java.ecommerce.model.Products;

public class searchByProductId {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter productid");
		int pid=sc.nextInt();
		Product p= new Product();
		try {
			Products product=null;
			product=p.searchByProductId(pid);
			if(product!=null) {
				System.out.println(product);
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
