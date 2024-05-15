package com.java.ecommerce.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnUtil {
	public static Connection getConnection(String connstr) throws ClassNotFoundException, SQLException {
		ResourceBundle rb=ResourceBundle.getBundle("dp");
		String driver=rb.getString("driver");
		String user=rb.getString("user");
		String pwd=rb.getString("password");
		Class.forName(driver);
		return DriverManager.getConnection(connstr,user,pwd);
		
	}

}
