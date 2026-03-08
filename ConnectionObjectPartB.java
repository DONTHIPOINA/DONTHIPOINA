package com.qsp.simple_jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class ConnectionObjectPartB {

	public static void main(String[] args) {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student_db?user=postgres&password=test");
			System.out.println(con);
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
