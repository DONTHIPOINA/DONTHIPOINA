package jdbc_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Functions {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/store_procedure_db";
		String user="postgres";
		String pwd="test";
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection(url,user,pwd);
			//step3:
			CallableStatement cstm=con.prepareCall("select count_employee_gender_male");
			cstm.setString(1,"male");
			//step 4 execute query:
			ResultSet set=cstm.executeQuery();
			
			set.next();
			int result =set.getInt(1);
			System.out.println("Result:"+result);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}