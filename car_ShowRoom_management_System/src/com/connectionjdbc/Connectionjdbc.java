package com.connectionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionjdbc {
	
	static Connection con;

	public static Connection createC()
	{
		
		
		try {
			//load the driver class 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//create the connection...
			String user ="root";
			String password="Aakash@2971";
			String url="jdbc:mysql://localhost:3306/car_Showroom_management_System";
			
			
			con= DriverManager.getConnection(url,user,password);
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
		
	}
}
