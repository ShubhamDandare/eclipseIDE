package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

import Entity.studentity;
import utility.studutility;

public class studservice {
	public ArrayList<studentity> getstudlist() throws ClassNotFoundException, SQLException {
		ArrayList<studentity> list = new ArrayList<studentity>();

		Connection conn = studutility.getConnection();
		Statement stm = conn.createStatement();
		String sql = "select * from stud";
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			studentity se = new studentity();
			se.setName(rs.getString("name"));
			se.setAge(rs.getInt("age"));
			se.setDivision(rs.getString("division"));
			se.setRollno(rs.getInt("rollno"));
			se.setStanderd(rs.getString("standerd"));
			list.add(se);
		}
		int sum=0;
		for(studentity s:list)
		{
			sum=sum+s.getAge();
		}
		System.out.println("sum of age="+sum);
		return list;

	}
//public Map<Integer, studentity> getstudmap(ArrayList<studentity> list){
//
//	Map<Integer, studentity> map= new HashMap<Integer, studentity>();
//	for(studentity s : list)
//	{
//		map.put(s.getRollno(), s);
//	}
//	int sum=0;
//	for(studentity s:list)
//	{
//		sum=sum+s.getAge();
//	}
//	System.out.println(sum);
//return map;
//}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		studservice ss = new studservice();
		
		ArrayList<studentity> list = ss.getstudlist();
		//Map<Integer, studentity> getstudmap = ss.getstudmap(list);
		//System.out.println(getstudmap);
		System.out.println(list);
	}
}
