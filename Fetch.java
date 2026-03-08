package com.qsp.simple_jdbc_project;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class Fetch {
public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/student_db";
		String user="postgres";
		String pwd="test";
		try {
			//step1:load or register driver
			Class.forName("org.postgresql.Driver");
			//step2:create connection
			Connection con=DriverManager.getConnection(url,user,pwd);
			//write sql  query
			String sql="select * from student";
			//step3:create statement 
		
			Statement stm =con.createStatement();
			//step4:execute query
			//this method is dedicated for select query
			ResultSet set=stm.executeQuery(sql);
			while(set.next()) {
				int sid=set.getInt("sid");
				String name=set.getString("name");
				int age=set.getInt("age");
				System.out.println("SID:"+sid);               System.out.println("Name:"+name);
				System.out.println("Age:+age");
				System.out.println("-----------------------");
			}
			//step5:close connection  
			con.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException s) {
			s.printStackTrace();
		}
			
	}

}
