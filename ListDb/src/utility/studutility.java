package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class studutility {
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			getConnection();
		}

		public static Connection getConnection() throws ClassNotFoundException, SQLException {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			System.out.println("Connection created...!");
			return con;
		
	}

}
