package com.feedback;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static String url ="jdbc:mysql://127.0.0.1:3306/vpack";
	private static String user ="root";
	private static String pass = "1234";
	private static Connection con;
	
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, user, pass);
			
			
		}
		catch(Exception e) {
			System.out.println("Detabase connection is not success !!!");
		}
		return con;
	}

}
