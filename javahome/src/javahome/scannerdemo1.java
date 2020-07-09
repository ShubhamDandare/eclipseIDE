package javahome;

import java.util.Scanner;

public class scannerdemo1 {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter Name: ");
		String name= obj.nextLine();
		System.out.println("enter Gender: ");
		char gender=obj.next().charAt(0);
		System.out.println("enter Age: ");
		int age=obj.nextInt();
		System.out.println("Mobile Num: ");
		long mobileNo=obj.nextLong();
		System.out.println("enter CGPA: ");
		double cgpa=obj.nextDouble();
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Mobile Num: "+mobileNo);
		System.out.println("CGPA: "+cgpa);
	}
}
