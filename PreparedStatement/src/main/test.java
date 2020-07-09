package main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import entry.BuyEntry;
import entry.CartEntry;
import entry.ProductEntry;
import entry.UserEntry;
import service.CartService;
import service.ProductService;
import service.UserService;

public class test {
	static {
		try {
			UserService.CreatePreparedTable();
    		} catch (ClassNotFoundException e) {

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			ProductService.CreateProductTable();
		} catch (ClassNotFoundException e) {

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			CartService.CreateCartTable();
		} catch (ClassNotFoundException e) {

		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException, JsonParseException, JsonMappingException, IOException {
		while (true) {

System.out.println("enter u r choice ");
			System.out.println("1.create Register \n 2.login User \n 3.chose product \n 4.Chose Cart \n 5.BuyProduct");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			UserEntry ue = new UserEntry();
			ProductEntry pe= new ProductEntry();
			CartEntry ce=new CartEntry();
			BuyEntry be= new BuyEntry();
			switch (choice) {
			case 1:
				ue.userinput();
				break;
			case 2:
				ue.getRegisterinput();
				break;
			case 3:
				pe.getUserProduct();
			case 4:
				ce.getUserCart();
			case 5: 
				be.getUserBuy();
				
				
			}
		}

	}

}
