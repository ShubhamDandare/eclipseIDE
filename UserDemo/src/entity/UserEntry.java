package entity;

import java.util.Scanner;

public class UserEntry {    
Scanner sc =new Scanner(System.in);
public  void getCreateTable() {
	System.out.println("Enter the user id=");
	String userId= sc.nextLine();
	System.out.println("Enter the User Name=");
	String userName= sc.nextLine();
	System.out.println("Enter the user Email=");
	String userEmail= sc.nextLine();
	System.out.println("Enter the user Contact=");
	String userContact=sc.nextLine();
	  
	UserEntity ue= new UserEntity();
	ue.setUserId(userId);
	ue.setUserName(userName);
	ue.setUserEmail(userEmail);
	ue.setUserContact(userContact);
	
	
}
}
