package com.java.ecommerce.util;

import java.util.ResourceBundle;

public class DBPropertyUtil {
	public static String ConnectionString(String parameterfile)
	{
		ResourceBundle rb=ResourceBundle.getBundle(parameterfile);
		String url=rb.getString("url");
		return url;
		
	}
	

}
