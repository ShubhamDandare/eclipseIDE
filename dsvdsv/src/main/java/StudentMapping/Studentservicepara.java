package StudentMapping;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Studentservicepara {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	
		System.out.println("student entry given below=");
		ObjectMapper mapper = new ObjectMapper();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		studententity se = mapper.readValue(s, studententity.class);
		System.out.println(se);

		System.out.println("Student address given below");
		Scanner sc1 = new Scanner(System.in);
		String s1 = sc1.nextLine();
		StudentAddres sa = mapper.readValue(s1, StudentAddres.class);
		System.out.println(sa);

		System.out.println("Student marks and total given bellow");
		Scanner sc3 = new Scanner(System.in);
		String s2 = sc.nextLine();
		StudentMarks sm = mapper.readValue(s2, StudentMarks.class);
		System.out.println(sm);
		int totalmarks = sm.getSubmarks1() + sm.getSubmarks2() + sm.getSubmarks3() + sm.getSubmarks4();
		int avg = totalmarks / 4;
		System.out.println("totalmarks=" + totalmarks);
		System.out.println("avgmarks =" + avg);
		}
		}

