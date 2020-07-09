package com.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.Entry.ShopingEntry;
import com.service.ShopingService;

public class Test {

	static {
		try {
			ShopingService.getCreateTable();
		} catch (ClassNotFoundException e) {

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		while (true) {
			System.out.println("enter u r choice");
			System.out.println("1.create shoping\n 2.  ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			ShopingEntry se1 = new ShopingEntry();
			switch (choice) {
			case 1:
				se1.Createshoping();
				break;
			}
		}
	}

}
