package entry;

import java.util.Scanner;

import entity.StudentEntity;
import service.studentService;

public class studentEntry {
	public void getstudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name=");
		String Name = sc.nextLine();
		System.out.println("enter the submark1=");
		int mark1 = sc.nextInt();
		System.out.println("enter the submark2=");
		int mark2 = sc.nextInt();
		System.out.println("enter the submark3=");
		int mark3 = sc.nextInt();
		System.out.println("enter the submark4=");
		int mark4 = sc.nextInt();
		StudentEntity se = new StudentEntity();
		se.setName(Name);
		se.setMarkSub1(mark1);
		se.setMarksub2(mark2);
		se.setMarksub3(mark3);
		se.setMarksub4(mark4);

		studentService ss = new studentService();                     
		//ss.getStudentservice(se);
	int avg = ss.getStudentservice(se) / 4;
	System.out.println("total marks avg="+avg);


	}
}
