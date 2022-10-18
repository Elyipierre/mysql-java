package recipes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import recipes.exception.DbException;

public class dBConnection {
	private static final String SCHEMA = "recipes";
	private static final String USER = "recipes";
	private static final String PASSWORD =  "recipes";
	private static final String HOST  = "localhost";
	private static final int PORT = 3306;
	
	//We will now create a method to create a new 
	//connection every time we call it
	//Connection in JDBC is just an interface called connection
	
	public static Connection getConnection() {
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false",
				HOST,PORT,SCHEMA, USER, PASSWORD);
		
		System.out.println("connecting with url=" +url);
		
		/*
		 * We now create a connection by asking driver manager, a class in the JDBC library,
		 * to give a connection
		 */
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Successfully obtained connection!");
			return conn;
		} catch (SQLException e) {
			System.out.println("Error getting connetion.");
			throw new DbException(e);
		}
	}
	
	

}
