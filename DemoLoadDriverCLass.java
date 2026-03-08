package com.qsp.simple_jdbc_project;

public class DemoLoadDriverCLass {

	public static void main(String[] args) {
		//load driver class
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver class is loaded....");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

}
}