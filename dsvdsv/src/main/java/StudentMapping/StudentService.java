package StudentMapping;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentService {
	public void getstudententity() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper obj = new ObjectMapper();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		studententity se = obj.readValue(s, studententity.class);
		System.out.println(se);
	}

	public void getStudentAddres() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper obj = new ObjectMapper();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		StudentAddres sa = obj.readValue(s1, StudentAddres.class);
		System.out.println(sa);

	}

	public void getStudentmarks() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper obj = new ObjectMapper();
		Scanner sc = new Scanner(System.in);
		String s2 = sc.nextLine();
		StudentMarks sm = obj.readValue(s2, StudentMarks.class);
		System.out.println(sm);
		int totalmarks = sm.getSubmarks1() + sm.getSubmarks2() + sm.getSubmarks3() + sm.getSubmarks4();
		int avg = totalmarks / 4;
		System.out.println("totalmarks=" + totalmarks);
		System.out.println("avgmarks =" + avg);
	}

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		System.out.println("student details given bellow");
		StudentService ss = new StudentService();
		System.out.println("plz enter the given entity");
		ss.getstudententity();
		System.out.println("plz eneter the given Address");
		ss.getStudentAddres();
		System.out.println("plz enter the given marks");
		ss.getStudentmarks();
	}
}
