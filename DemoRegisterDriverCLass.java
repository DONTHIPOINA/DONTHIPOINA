package com.qsp.simple_jdbc_project;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class DemoRegisterDriverCLass {

	public static void main(String[] args) {
	//step1:create object for Driver class
		Driver driver = new Driver();
		
		try {
			//step2:class register Driver();
			DriverManager.registerDriver(driver);
			System.out.println("register done....");
			}catch(SQLException e) {
				e.printStackTrace();
			}
	      }
      }