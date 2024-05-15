package com.java.ecommerce.dao;

import java.sql.SQLException;

public interface ICart {
	int generateCartId() throws ClassNotFoundException, SQLException;
          
}
