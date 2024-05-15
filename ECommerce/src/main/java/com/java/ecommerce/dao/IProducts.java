package com.java.ecommerce.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.ecommerce.model.Products;

public interface IProducts {

	boolean available(int q,int pid) throws ClassNotFoundException, SQLException; 
	List<Products> showProducts() throws ClassNotFoundException, SQLException;
	Products searchByProductId(int pid) throws ClassNotFoundException, SQLException;
	

}
