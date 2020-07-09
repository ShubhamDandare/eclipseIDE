package javahome;
import java.util.Scanner;
public class scannerdemo2 {
	public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
int num;
	System.out.println("please enter the marks: ");
	 num =obj.nextInt();
	
	if (num>=35) 
	{
		System.out.println("pass");
		}
	 else if (num>=75)
		System.out.println("good rank");
	 else if (num>=60) 
	{
		System.out.println(" 1st rank");
	}
	 else if (num>=50)
	{System.out.println("2nd rank");
	}
	
}}