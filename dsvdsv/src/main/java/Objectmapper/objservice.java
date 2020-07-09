package Objectmapper;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class objservice {
	public String insertvalue(String s1,String s2) {
	String s3=s1.concat(s2);
	return s3;
	}
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper= new ObjectMapper();
		Scanner sc =new Scanner(System.in);
		System.out.println("plz enter the given name below");
		String s4=sc.nextLine();
		ObjEntity oe=mapper.readValue(s4, ObjEntity.class);
		System.out.println(oe);
	objservice os=new objservice();
//	os.insertvalue(s1, s2);
		String firstname=oe.getFirstname();
		String lastname=oe.getLastname();
		String s5=os.insertvalue(firstname, lastname);
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
	}
}
