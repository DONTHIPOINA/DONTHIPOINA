		package com.qsp.simple_jdbc_project;
		import java.sql.SQLException;
		import java.sql.Statement;
		import java.sql.Connection;
		import java.sql.DriverManager;
		public class InsertRecord {
			public static void main(String[]args) {
				String url="jdbc:postgresql://localhost:5432/employee_db";
				String user="postgres";
				String pwd="test";
				try {
					//step1:load or register driver class
					Class.forName("org.postgresql.Driver");
					//step 2:create connection
					Connection con=DriverManager.getConnection(url,user,pwd);
					//write sql query
					String sql = "insert into  employee values(101,'patlu',79)";
							//step 3:create statement
							Statement stm=con.createStatement();
					//step 4:execute query
					stm.execute(sql);
					//step 5:close connection
					con.close();
					System.out.println(" data is inserted.........");	
				}catch(ClassNotFoundException e) {
				e.printStackTrace();
			   }catch(SQLException s) {
				s.printStackTrace();
				}
			}
		}