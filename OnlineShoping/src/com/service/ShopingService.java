package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Entity.shopingEntity;
import com.Utility.shopingutility;

public class ShopingService {

	public void CreateShoping(shopingEntity se) throws ClassNotFoundException, SQLException {

		Connection connection = shopingutility.getConnection();
		Statement stm = connection.createStatement();
		String sql = "insert into Shoping values('" + se.getShopingId() + "','" + se.getShopingName() + "','"
				+ se.getShopingProduct() + "','" + se.getShopingcost() + "')";
		stm.executeUpdate(sql);
		System.out.println(sql);

	}

	public static void getCreateTable() throws ClassNotFoundException, SQLException {

		Connection connection = shopingutility.getConnection();
		Statement stm = connection.createStatement();
		String sql = "create table Shoping (shopingId varchar(10),shopingName varchar(50),shopingproduct varchar(100),shopingcost varchar(100))";
		stm.execute(sql);
		System.out.println(sql);

	}
public static void getCreateUserTable() throws  SQLException, ClassNotFoundException {
	Connection connection=shopingutility.getConnection();
	Statement stm =connection.createStatement();
	String sql="create table User (primary key userId varchar(10),userName varchar(100),userEmail varchar(100),userContact varchar(100))";
    stm.execute(sql);
    System.out.println(sql);
    
    
}



}
