package com.qsp.simple_jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;
public class DemoConnectionObjectPartA {

	public static void main(String[] args) {
	try {
		//register the driver class
		Driver driver =new Driver();
		DriverManager.registerDriver(driver);
		//create connection
		Connection con =DriverManager
	.getConnection("jdbc:postgresql://localhost:5432/Student_db","postgres","test");
		System.out.println(con);
	}catch (SQLException e) {
	e.printStackTrace();
	
	}
	}
}