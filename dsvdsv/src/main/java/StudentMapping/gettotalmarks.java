package StudentMapping;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class gettotalmarks {
	public int gettotalmarks(StudentMarks sm, StudentAddres sa, studententity se)
			throws JsonParseException, JsonMappingException, IOException {

		
		int totalmark = sm.getSubmarks1() + sm.getSubmarks2() + sm.getSubmarks3() + sm.getSubmarks4();
		int avg = totalmark / 4;

		System.out.println(sa);
		System.out.println(se);
		System.out.println(sm);
	    System.out.println(avg);
		return totalmark;
	}

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		System.out.println("student entry given below=");
		ObjectMapper mapper = new ObjectMapper();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		studententity se = mapper.readValue(s, studententity.class);

		System.out.println("Student address given below");
		Scanner sc1 = new Scanner(System.in);
		String s1 = sc1.nextLine();
		StudentAddres sa = mapper.readValue(s1, StudentAddres.class);

		System.out.println("Student marks and total given bellow");
		Scanner sc3 = new Scanner(System.in);
		String s2 = sc.nextLine();
		StudentMarks sm = mapper.readValue(s2, StudentMarks.class);
		gettotalmarks gm = new gettotalmarks();
		int a=gm.gettotalmarks(sm, sa, se);
		System.out.println(a);
	}
}
