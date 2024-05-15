package com.java.ecommerce.main;

import java.sql.SQLException;
import java.util.List;

import com.java.ecommerce.dao.Product;
import com.java.ecommerce.model.Products;

public class showProducts {
	public static void main(String[] args) {
		Product p=new Product();
		try {
			List<Products> productList=null;
			productList=p.showProducts();
			if(productList!=null) {
			for (Products products : productList) {
				System.out.println(products);
			}
			}
			if(productList.size()==0) {
				System.out.println("Records not found");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
