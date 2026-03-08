	    package com.qsp.simple_jdbc_project;
		import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
		public class ReadStudentRecord {
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
					String sql="Insert into student_db values(?,?,?)";
					
					    //step3: create statement
				Statement	pstm=con.createStatement();
					
					
					    //step4: execute query
					pstm.execute(sql);
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
