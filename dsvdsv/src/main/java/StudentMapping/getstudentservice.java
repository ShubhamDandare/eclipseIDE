package StudentMapping;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class getstudentservice {
	public studententity getstudententity(ObjectMapper obj, Scanner sc)
			throws JsonParseException, JsonMappingException, IOException {
		
		String s1 = sc.nextLine();
		studententity se=obj.readValue(s1, studententity.class);
		System.out.println(se);
		return se;
	}

	public StudentAddres getstudentadress(ObjectMapper obj, Scanner sc)
			throws JsonParseException, JsonMappingException, IOException {
		
		String s2 = sc.nextLine();
		StudentAddres sa=obj.readValue(s2, StudentAddres.class);
		System.out.println(sa);
		return sa;

	}

	public StudentMarks getstudentmark(ObjectMapper obj, Scanner sc)
			throws JsonParseException, JsonMappingException, IOException {
		
		String s3 = sc.nextLine();
		StudentMarks sm=obj.readValue(s3, StudentMarks.class);
		System.out.println(sm);
		return sm;
	}

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	
		getstudentservice ss = new getstudentservice();
		ObjectMapper obj = new ObjectMapper();
		Scanner sc = new Scanner(System.in);
		System.out.println("Student address given below");
		StudentAddres sa=ss.getstudentadress(obj, sc);
		
		System.out.println("Student entity given below");
		studententity se=ss.getstudententity(obj, sc);
		System.out.println("Student marks given below");
		StudentMarks sm=ss.getstudentmark(obj, sc);
		gettotalmarks gt=new gettotalmarks();
//		studententity se=new studententity();
//		
//		StudentAddres sa=new StudentAddres();
//		StudentMarks sm =new StudentMarks();
		
		int a=gt.gettotalmarks(sm, sa, se);
		System.out.println(a);
		
		
		
		
	}
}
