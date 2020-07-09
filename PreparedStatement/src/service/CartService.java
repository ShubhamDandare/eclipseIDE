package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import QuerryUtility.UserCreateQuerry;
import entity.CartEntity;
import entry.CartEntry;
import utility.PreparedUtility;

public class CartService {
public static void CreateCartTable() throws ClassNotFoundException, SQLException {
	Connection connection=PreparedUtility.getConnection();
	PreparedStatement pdstm=connection.prepareStatement(UserCreateQuerry.CreateCartTable);
	pdstm.execute();
	System.out.println(pdstm);
}
public void getCart(CartEntity ce) throws ClassNotFoundException, SQLException {
	Connection connection= PreparedUtility.getConnection();
	PreparedStatement pdstm=connection.prepareStatement(UserCreateQuerry.InsertCartQuerry);
	pdstm.setInt(1, ce.getCartId());
	pdstm.setInt(2, ce.getUserId());
	pdstm.setInt(3, ce.getProductId());
	pdstm.setInt(4, ce.getCartQuantity());
	pdstm.executeUpdate();
}
}
