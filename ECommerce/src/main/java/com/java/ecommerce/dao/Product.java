package com.java.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.ecommerce.model.Products;
import com.java.ecommerce.util.DBConnUtil;
import com.java.ecommerce.util.DBPropertyUtil;

public class Product implements IProducts{
	Connection con;
	PreparedStatement pst;

	@Override
	public boolean available(int q,int pid) throws ClassNotFoundException, SQLException {
		boolean flag=true;
		String str=DBPropertyUtil.ConnectionString("dp");
		con=DBConnUtil.getConnection(str);
		String cmd="select stockquantity from products where product_id=? ";
		pst=con.prepareStatement(cmd);
		pst.setInt(1, pid);
		ResultSet rs=pst.executeQuery();
		rs.next();
		int a=rs.getInt("stockquantity");
		if(q>a) {
			flag=false;
		}
		return flag;
	}

	@Override
	public List<Products> showProducts() throws ClassNotFoundException, SQLException {
		String str=DBPropertyUtil.ConnectionString("dp");
		con=DBConnUtil.getConnection(str);
		String cmd="select * from products";
	    pst=con.prepareStatement(cmd);
	    ResultSet rs= pst.executeQuery();
	    Products product=null;
	    List<Products> productList=new ArrayList<Products>();
	    while(rs.next()) {
	    	product=new Products();
	    	product.setProduct_id(rs.getInt("product_id"));
	    	product.setProduct_name(rs.getString("product_name"));
	    	product.setPrice(rs.getDouble("price"));
	    	product.setDescr(rs.getString("descr"));
	    	product.setStockQuantity(rs.getInt("stockquantity"));
	    	productList.add(product);
	    }
	    return productList;
	}

	@Override
	public Products searchByProductId(int pid) throws ClassNotFoundException, SQLException {
		String str=DBPropertyUtil.ConnectionString("dp");
		con=DBConnUtil.getConnection(str);
		String cmd="select * from products where product_id=?";
		pst=con.prepareStatement(cmd);
		pst.setInt(1, pid);
		ResultSet rs=pst.executeQuery();
		Products product=null;
		if(rs.next()) {
			product=new Products();
			product.setProduct_id(pid);
	    	product.setProduct_name(rs.getString("product_name"));
	    	product.setPrice(rs.getDouble("price"));
	    	product.setDescr(rs.getString("descr"));
	    	product.setStockQuantity(rs.getInt("stockquantity"));
		}
		return product;
	}
	
}
