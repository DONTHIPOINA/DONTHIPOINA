package com.qsp.simple_jdbc_project;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class UpdateRecord {
	public static void main(String[] args) {
   String url="jdbc:postgresql://localhost:5432/employee";
   String user="postgres";
   String pwd="test";
   try {
		//step 1:load or register driver
	   Class.forName("org.postgresql.Driver");
	   //step2:create connection
	   Connection con=DriverManager.getConnection(url,user,pwd);
	   //write query
	   String sql ="update student_db set name 'patlu' where sid=101";
	   //step 3:create statement
	   Statement stm =con.createStatement();
	   //step 4:execute query
	   stm.execute (sql);
	   //step 5:close connection
	   con.close();
	   System.out.println("data is updated.....");
	} catch(ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException s) {
			s.printStackTrace();
		}
	}
}