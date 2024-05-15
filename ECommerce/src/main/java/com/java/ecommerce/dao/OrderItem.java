package com.java.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.ecommerce.util.DBConnUtil;
import com.java.ecommerce.util.DBPropertyUtil;

public class OrderItem implements IOrderItems {
	Connection con;
	PreparedStatement pst;
	@Override
	public int generateOrderItemId() throws ClassNotFoundException, SQLException {
		String constr=DBPropertyUtil.ConnectionString("dp");
		con=DBConnUtil.getConnection(constr);
		String cmd="Select max(order_item_id)+1 oid from order_items";
		pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		int oid=rs.getInt("oid");
		return oid;
		
	}
	
	

}
