package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import entity.RegisterEntity;
import utility.PreparedUtility;

public class UserService {
	Scanner sc = new Scanner(System.in);

	public String InsertPreparedStmt() {
		String sql = "insert into user(id,name,email,contact,password) values(?,?,?,?,?)";

		return sql;
	}

	public void InsertRecord(RegisterEntity re) throws ClassNotFoundException, SQLException {
//	PreparedUtility pu= new PreparedUtility();
		String insertPreparedStmt = InsertPreparedStmt();
		try {

			Connection connection = PreparedUtility.getConnection();

			PreparedStatement preparedstm = connection.prepareStatement(insertPreparedStmt);
			preparedstm.setInt(1, re.getUserId());
			preparedstm.setString(2, re.getUserName());
			preparedstm.setString(3, re.getUserEmail());
			preparedstm.setString(4, re.getUserContact());
			preparedstm.setString(5, re.getPassword());
			preparedstm.executeUpdate();

		} catch (ClassNotFoundException e) {

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void CreatePreparedTable() throws ClassNotFoundException, SQLException {
		Connection connection = PreparedUtility.getConnection();
		Statement stm = connection.createStatement();
		String sql = "create table user(id int(10),name varchar(100),email varchar(100),contact varchar(100),password varchar(100),primary key (id))";
		stm.execute(sql);
		System.out.println(sql);

	}

	public void getLoging(String username, String password) throws ClassNotFoundException, SQLException {
		Connection connection = PreparedUtility.getConnection();
		String sql = "select name ,password from user where name=? and password=?";
		PreparedStatement preparedstm = connection.prepareStatement(sql);
		preparedstm.setString(1, username);
		preparedstm.setString(2, password);
		ResultSet rs = preparedstm.executeQuery();

		String dbUserName = null, dbPassword = null;
		while (rs.next()) {
			dbUserName = rs.getString("name");
			dbPassword = rs.getString("password");
		}

		if (username.equals(dbUserName) && password.equals(dbPassword)) {
			System.out.println("Login sussess");
		} else {
			System.out.println("Failed");
		}
	}

}
