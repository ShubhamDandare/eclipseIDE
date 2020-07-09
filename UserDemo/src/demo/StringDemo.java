package demo;

import java.util.Scanner;

public class StringDemo {
	public String getstring(String s1, String s2) {

	String s3 = new StringBuffer(s1).append(s2).toString();
	//String s3=s1.concat(s2);
	
		
		return s3;
	}

	public static void main(String[] args) {
		StringDemo sd = new StringDemo();
Scanner sc= new Scanner(System.in);
System.out.println("Enter the 1St string name=");
String s1=sc.nextLine();
System.out.println("enter the 2nd String name=");
String s2=sc.nextLine();

//		String s1 = "pratik ";
//		String s2 = "Dandare";
		String s4=sd.getstring(s1, s2);
	
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
	}
}
