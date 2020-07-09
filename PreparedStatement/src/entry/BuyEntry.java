package entry;

import java.sql.SQLException;
import java.util.Scanner;

import entity.BuyEntity;
import service.BuyService;

public class BuyEntry {
	Scanner sc=new Scanner(System.in);
public void getUserBuy() throws ClassNotFoundException, SQLException {
	System.out.println("enter the userId=");
	String UserId= sc.nextLine();

	

	
	BuyService bs= new BuyService();
	
														
	bs.getBuyFromUser(UserId);
	
  
	

}
}