package com.jsp.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	
	public Connection getConnection() {
		String url ="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root321";
		Connection connection=null;
		
		//step1:Load/Register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			 connection=DriverManager.getConnection(url, username, password);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
		    e.printStackTrace();
		}
		
		return connection;
	}

}
