package javahome;
import java.util.Scanner;
public class oddeven {
public static void main(String[] args) {
	Scanner obj=new Scanner (System.in);
int num;
num=obj.nextInt();
if (num % 2==0)
{System.out.println(num +"given num is even");
}
else {
	System.out.println(num +"given num is odd");
}
}
}