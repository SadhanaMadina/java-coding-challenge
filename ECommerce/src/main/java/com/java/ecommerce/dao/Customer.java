package com.java.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.ecommerce.model.Customers;
import com.java.ecommerce.util.DBConnUtil;
import com.java.ecommerce.util.DBPropertyUtil;


public class Customer implements ICustomers {
	Connection con;
	PreparedStatement pst;

	@Override
	public List<Customers> showCustomers() throws ClassNotFoundException, SQLException {
		String str=DBPropertyUtil.ConnectionString("dp");
		con=DBConnUtil.getConnection(str);
		String cmd="select * from customers";
		pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		List<Customers> customerList = new ArrayList<Customers>();
		Customers customer=null;
		while(rs.next()) {
			customer = new Customers();
			customer.setCustomer_id(rs.getInt("customer_id"));
			customer.setFirst_name(rs.getString("first_name"));
			customer.setLast_name(rs.getString("last_name"));
			customer.setEmail(rs.getString("email"));
			customer.setPassword(rs.getString("password"));
			customer.setAddress(rs.getString("address"));
			customerList.add(customer);
		}
		return customerList;
	}

	@Override
	public Customers SearchByCustomerId(int customer_id) throws ClassNotFoundException, SQLException {
		String connstr = DBPropertyUtil.ConnectionString("dp");
		con=DBConnUtil.getConnection(connstr);
		String cmd="select * from customers where customer_id=?";
		pst=con.prepareStatement(cmd);
		pst.setInt(1, customer_id);
		ResultSet rs=pst.executeQuery();
		Customers customer = null;
		if(rs.next()) {
			customer = new Customers();
			customer.setCustomer_id(customer_id);
			customer.setFirst_name(rs.getString("first_name"));
			customer.setLast_name(rs.getString("last_name"));
			customer.setEmail(rs.getString("email"));
			customer.setPassword(rs.getString("password"));
			customer.setAddress(rs.getString("address"));
			
		}
		return customer;
	}

	@Override
	public Customers searchByEmail(String email) throws ClassNotFoundException, SQLException {
		String connstr = DBPropertyUtil.ConnectionString("dp");
		con=DBConnUtil.getConnection(connstr);
		String cmd="select * from customers where email=?";
		pst=con.prepareStatement(cmd);
		pst.setString(1, email);
		ResultSet rs=pst.executeQuery();
		Customers customer = null;
		if(rs.next()) {
			customer = new Customers();
			customer.setCustomer_id(rs.getInt("customer_id"));
			customer.setFirst_name(rs.getString("first_name"));
			customer.setLast_name(rs.getString("last_name"));
			customer.setEmail(email);
			customer.setPassword(rs.getString("password"));
			customer.setAddress(rs.getString("address"));
			
		}
		return customer;
	}

	@Override
	public int authenticateCustomer(String email, String pwd) throws ClassNotFoundException, SQLException {
		updatingpwd(pwd,email);
		String connStr = DBPropertyUtil.ConnectionString("dp");
		con = DBConnUtil.getConnection(connStr);
		String encr = EncryptPassword.getCode(pwd);
		String cmd = "select count(*) cnt from Customers where email = ? and password=? ";
		pst = con.prepareStatement(cmd);
		pst.setString(1, email);
		pst.setString(2, encr);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		return cnt;
	}

	@Override
	public void updatingpwd(String pwd,String email) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.ConnectionString("dp");
		con = DBConnUtil.getConnection(connStr);
		String encr = EncryptPassword.getCode(pwd);
		String cmd="update customers set password=? where password=?";
		pst=con.prepareStatement(cmd);
		pst.setString(1, encr);
		pst.setString(2, pwd);
		pst.executeUpdate();
		
	}


	
}
