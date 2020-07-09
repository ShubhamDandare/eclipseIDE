package entry;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import entity.RegisterEntity;
import service.UserService;
import utility.PreparedUtility;

public class UserEntry {

	Scanner sc = new Scanner(System.in);

	public void userinput() throws ClassNotFoundException, SQLException {
		System.out.println("enter the valid id =");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("enter the name =");
		String name = sc.nextLine();
        
		System.out.println("enter the contact =");
		String contact = sc.nextLine();
         
		System.out.println("enter the Email =");
		String email = sc.nextLine();
		
		System.out.println("enter the password =");
		String password = sc.nextLine();

	
		
		RegisterEntity re1 = new RegisterEntity();
		re1.setUserId(id);
		re1.setUserName(name);
		re1.setUserEmail(email);
		re1.setUserContact(contact);
		re1.setPassword(password);

		UserService us = new UserService();
		us.InsertRecord(re1);
	}

	public void getRegisterinput() throws ClassNotFoundException, SQLException {
		System.out.println("Enter the username= ");
		String username = sc.next();
		System.out.println("Enter the password =");
		String password = sc.next();
		UserService us = new UserService();
		us.getLoging(username, password);

	}

}
