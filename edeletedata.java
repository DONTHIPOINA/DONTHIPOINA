package com.qsp.simple_jdbc_project;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.sql.Connection;
	public class edeletedata {
	public static void main(String[] args){
			String url="jdbc:postgresql://localhost:5432/student_db";
			String user="postgres";
			String pwd="test";
			try {
				//step 1:load or register driver
				Class.forName("org.postgresql.Driver");
				//step2:create connection
				Connection Con =DriverManager.getConnection(url,user,pwd);
				//write query
				String sql="delete from employee where id = 105";
				//step3:create statement
				Statement stm=Con.createStatement();
				//step4:execute query
				stm.execute(sql);
				//step5:close  Connection
				Con.close();
				System.out.println("data is deleted...");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		   }catch(SQLException s) {
			s.printStackTrace();
		  }
		}
	}

