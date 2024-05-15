package com.java.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.ecommerce.util.DBConnUtil;
import com.java.ecommerce.util.DBPropertyUtil;

public class Carts implements ICart {
	Connection con;
	PreparedStatement pst;

	@Override
	public int generateCartId() throws ClassNotFoundException, SQLException {
		String constr=DBPropertyUtil.ConnectionString("dp");
		con=DBConnUtil.getConnection(constr);
		String cmd="Select max(cart_id)+1 cid from cart";
		pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		int cid=rs.getInt("cid");
		return cid;
		
	}

}
