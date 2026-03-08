	package com.qsp.simple_jdbc_project;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	public class InsertRecordUsingPreparedStatement {
	public static void main(String[] args) {
			String url="jdbc:postgresql://localhost:5432/student_db";
			String user="postgres";
			String pwd="test";
			    //step1: load or register driver class
			try {
				Class.forName("org.postgresql.Driver");
			        //step2: create connection
				Connection con=DriverManager.getConnection(url,user,pwd);
				 //write sql query
				String sql="Insert into student values(?,?,?)";
				    //step3: create statement
				PreparedStatement pstm=con.prepareStatement(sql);
				pstm.setInt(1, 608);
				pstm.setString(2, "naushd");
				pstm.setInt(3, 99);
				//step4: execute query
				pstm.execute();
				System.out.println("congratulation data is inserted..............");
				//step5: close connection
				con.close();
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}