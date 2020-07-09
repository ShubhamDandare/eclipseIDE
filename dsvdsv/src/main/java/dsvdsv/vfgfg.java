package dsvdsv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dsvdsv.Student;

public class vfgfg {

	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, IOException, ClassNotFoundException, SQLException {
		System.out.println("Hello word...");
		ObjectMapper mapper = new ObjectMapper();
		Scanner sc = new Scanner(System.in);
		
		vfgfg vg = new vfgfg();
//		vg.CreateTable();
		System.out.println("enter the student details");

		String json = sc.nextLine();

		Student student = mapper.readValue(json, Student.class);
		System.out.println(student);
		vg.InsertValue(student);

	}

	public void CreateTable() throws ClassNotFoundException, SQLException {
		try {
			Connection connection = StudentUtility.getConnection();
			String sql = "create table stud (name varchar(100),age int(10),division varchar(100),rollno int (10),standerd varchar(100),primary key(rollno))";
			PreparedStatement pdstm = connection.prepareStatement(sql);
			pdstm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void InsertValue(Student s) throws SQLException, ClassNotFoundException {
		try {
			Connection connection = StudentUtility.getConnection();
			String sql = "insert into stud(name,age,division,rollno,standerd) values(?,?,?,?,?)";
			PreparedStatement pdstm = connection.prepareStatement(sql);
			pdstm.setString(1, s.getName());
			pdstm.setInt(2, s.getAge());
			pdstm.setString(3, s.getDivision());
			pdstm.setInt(4, s.getRollno());
			pdstm.setString(5, s.getStanderd());
			pdstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
