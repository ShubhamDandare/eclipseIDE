package Entry;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import utility.Addutility;

public class AddnumEntry {
	public void add() throws ClassNotFoundException, SQLException {
		Connection connection = Addutility.getConnection();
		String sql = "select * from addition";
		PreparedStatement pdstm = connection.prepareStatement(sql);
		ResultSet rs = pdstm.executeQuery();
		int sum = 0;
		while (rs.next()) {

//			String num = rs.getString("number");
//			int parseInt = Integer.parseInt(num);
//			sum = sum + parseInt;
			

		}
//		System.out.println(sum);
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AddnumEntry an= new AddnumEntry();
		an.add();
	}
}
