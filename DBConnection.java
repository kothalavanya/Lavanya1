package com.niit.login.connecting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{

	
		// TODO Auto-generated method stub
		private static String userName="sa";
		private static String password="";
		private static String url="jdbc:h2:tcp://localhost/~/test";

		private static String driver="org.h2.Driver";
		private static Connection connection=null;
		
		private DBConnection()
		{
			
		}
		public static Connection getDBConnection()
		{
			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(url, userName, password);
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection;
		}
		public static void main(String[] args) {
			if(getDBConnection()==null)
			{
				System.out.println("Connection not established");
			}
			else
			{
				System.out.println("Connection established ");
			}

			
		}
}

		