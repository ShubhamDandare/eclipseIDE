package javahome;

import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("please enter the value of A: ");
		int a=obj.nextInt();
		System.out.println("please enter the value of B: ");
		int b=obj.nextInt();
		System.out.println("Enter the opration");
		int result=obj.nextInt();
		
		switch(result) {
		case 1:
			System.out.println("Addition of two num is ="+(a+b));
			break;
		case 2:
			System.out.println("Substractin of two num is ="+(a-b));
			break;
	    case 3:
				System.out.println("multiply of two num is ="+(a*b));
				break;
		case 4:
					System.out.println("Divied of two num is ="+(a/b));
					break;
		case 5:
			System.out.println("Reminder of variable is ="+(a%b));
			break;
		default:
			System.out.println("Result not found");
		}
	}
	
	
	
}