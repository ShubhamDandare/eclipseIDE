package entry;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import entity.CartEntity;
import service.CartService;

public class CartEntry {
 Scanner sc =new Scanner(System.in);
 
	public void getUserCart() throws ClassNotFoundException, SQLException, JsonParseException, JsonMappingException, IOException {
		
		
//		System.out.println("Provide cart details : ");
//		String input = sc.nextLine();
//		
//		ObjectMapper mapper = new ObjectMapper();
//		CartEntity readValue = mapper.readValue(input, CartEntity.class);
		
		System.out.println("enter the the cartId=");
		int CartId=sc.nextInt();
		System.out.println("enter the UserId=");
		int UserId=sc.nextInt();
		System.out.println("enter the ProductId=");
		int ProductId=sc.nextInt();
		System.out.println("enter the CartQuantity=");
		int CartQuantity=sc.nextInt();
		
		CartEntity ce= new CartEntity();
		ce.setCartId(CartId);
		ce.setUserId(UserId);
		ce.setProductId(ProductId);
		ce.setCartQuantity(CartQuantity);;
		
		CartService cs= new CartService();
		cs.getCart(ce);
		
	}
}
