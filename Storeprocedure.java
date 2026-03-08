package jdbc_StoreProcedure;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


		   public class Storeprocedure {
			public static void main (String[]args) {
				
				String url = "jdbc:postgresql://localhost:5432/storeProcedure";
				String user = "postgres";
				String pwd = "test";
				
				try {
					Class.forName("org.postgresql.Driver");
					
					Connection con = DriverManager.getConnection(url,user,pwd);
					
					CallableStatement cstm = con.prepareCall("call createemployee(?,?,?,?,?,?)");
					cstm.setInt(1,777);
					cstm.setString(2, "pitbull");
					cstm.setString(3, "p@gmail.com");
					cstm.setString(4, "male");
					cstm.setDouble(5, 8565);
					cstm.setInt(6, 6544);
					
					cstm.execute();
					 System.out.println("data is inserted.....");
					 
					 con.close();
				} catch (ClassNotFoundException e) {
					// TODO: handle exception
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} 
				
			
				
		}
	}