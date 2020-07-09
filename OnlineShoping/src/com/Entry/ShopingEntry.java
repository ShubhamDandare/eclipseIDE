package com.Entry;

import java.sql.SQLException;
import java.util.Scanner;

import com.Entity.shopingEntity;
import com.service.ShopingService;

public class ShopingEntry {
	Scanner sc =new Scanner(System.in);
	public void Createshoping() throws ClassNotFoundException, SQLException {
		System.out.println("Enter the shoping id=");
		String ShopingId= sc.nextLine();
		System.out.println("Enter the shopingName=");
		String ShopingName= sc.nextLine();
		System.out.println("Enter the shopingproduct=");
		String Shopingproduct= sc.nextLine();
		System.out.println("Enter the shopingcost=");
		String Shopingcost=sc.nextLine();
		
		shopingEntity se = new shopingEntity();
		se.setShopingId(ShopingId);
		se.setShopingName(ShopingName);
		se.setShopingProduct(Shopingproduct);
		se.setShopingcost(Shopingcost);
		
	ShopingService ss= new ShopingService();
	ss.CreateShoping(se);
		
		
		

		
		
		
	}

}


