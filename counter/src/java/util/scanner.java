package java.util;
import java.util.scanner;
public class scanner {
	int a;
	int b;
	String result;
	
       public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("please enter the value of A: ");
		int a=obj.nextInt();
		System.out.println("please enter the value of B: ");
		int b=obj.nextInt();
		String result=obj.nextLine();
		
		switch(result) {
		case "+":
			System.out.println("Addition of two num is ="+(a+b));
			break;
		case "-":
			System.out.println("Substractin of two num is ="+(a-b));
			break;
	    case "*":
				System.out.println("multiply of two num is ="+(a*b));
				break;
		case "/":
					System.out.println("Divied of two num is ="+(a/b));
					break;
		default:
			System.out.println("Result not found");
		}
	}
	
	
	
}