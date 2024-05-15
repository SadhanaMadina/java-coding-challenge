package com.java.ecommerce.dao;

import java.sql.SQLException;

public interface IOrderItems {
	int generateOrderItemId() throws ClassNotFoundException, SQLException;

}
