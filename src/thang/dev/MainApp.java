package thang.dev;

import java.sql.DriverManager;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final String DB_URL = "jdbc:mysql://localhost:3306/jsweb";
	final String USER = "root";
	final String PASS = "";
	
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // libraries
			DriverManager.getConnection(DB_URL, USER, PASS); // connect
			System.out.println("Connecting Success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
