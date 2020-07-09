package com.shubhamQuerry;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Querry {
//	private String querry;
//	private String[]parameter;
//public void save(String querry,String[]parameter) throws ClassNotFoundException, SQLException {
//	Connection connection=QuerryUtility.getConnection();
//	String querry1="insert into tablename values(?,?,?,?,?)";
//	
//	PreparedStatement ps= connection.prepareStatement(querry1);
//	ps.executeUpdate();
//	
//	for(int i=1;i<=parameter.length;i++) {
//		ps.setString(i,parameter[i] );
//	}
//System.out.println("abc");
//}
//public static void main(String[] args) {
//	Querry q= new Querry();
//	q.save(
//			);
//}

	public int save(String querry, String[] parameter) throws ClassNotFoundException, SQLException {
		Connection connection = QuerryUtility.getConnection();

		PreparedStatement ps = connection.prepareStatement(querry);
		ps.executeUpdate();

		for (int i = 1; i <= parameter.length; i++) {
			ps.setString(i, parameter[i]);
		}
	int A=	ps.executeUpdate();
	return A;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Querry q = new Querry();

		String query = "Insert into tablename values(?,?,?,?,?,?,?)";
		String param[] = {"name","address","rollNo","standerd","percentage","cast","isDeleted"};
		
		 q.save(query, param);
		 int abc= q.save(query, param);
	
	
      if(abc==0) {
    	 System.out.println("succesfully insert"); 
      }else {
    	  System.out.println("not succesfully insert");
      }
}
}