package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;
//import java.sql.Statement;

public class JdbcDemo {
	
	static final String demo = "com.mysql.cj.jdbc.Driver";
	static final String db_url = "jdbc:mysql://localhost/test";
	static final String username = "root";
	static final String password="mysqlroot";
	
	public static void main(String[] args)throws SQLException {
		//declare variable
		Connection connection = null;
		Statement statement = null;
		
		try {
			System.out.println("connecting..");
			//loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connecting db
			connection = DriverManager.getConnection(db_url,username,password);
			System.out.println("connected..");
		}catch(Exception e) {
			e.printStackTrace();
		}
		//statement.close();
		connection.close();
		}
	}

