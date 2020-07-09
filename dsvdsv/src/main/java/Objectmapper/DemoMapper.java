package Objectmapper;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoMapper {
	private static String firstname;
	 private static String lastname;
	 

	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "DemoMapper [firstname=" + firstname + ", lastname=" + lastname + "]";
	}


	public DemoMapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper obj = new ObjectMapper();
				Scanner sc = new Scanner(System.in);
	System.out.println("given details below");
		String S = sc.nextLine();
		//DemoMapper dm=new DemoMapper();
		
		DemoMapper dm=obj.readValue(S,DemoMapper.class);
		System.out.println(dm);
//		Objservice os=new Objservice();
//		String s1=firstname;
//		String s2= lastname;
//	
//		os.insertvalue(s1, s2);
	}}
