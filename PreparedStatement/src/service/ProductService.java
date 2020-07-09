package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import QuerryUtility.UserCreateQuerry;
import entity.ProductEntity;
import utility.PreparedUtility;

public class ProductService {
	
public void InsertProduct(ProductEntity pe) throws ClassNotFoundException, SQLException {
	
	Connection connection= PreparedUtility.getConnection();
	PreparedStatement pdstm= connection.prepareStatement(UserCreateQuerry.InserProductQuerry);
	pdstm.setInt(1, pe.getProductId());
	pdstm.setString(2, pe.getProductName());
	pdstm.setString(3, pe.getProductPrice());
	pdstm.setString(4, pe.getProductQuantity());
	pdstm.setString(5, pe.getProductType());
	pdstm.executeUpdate();
	
}
public static void CreateProductTable() throws ClassNotFoundException, SQLException {
	Connection connection = PreparedUtility.getConnection();
	PreparedStatement pdstm= connection.prepareStatement(UserCreateQuerry.CreateProductQuerry);
	pdstm.execute();
	System.out.println(pdstm);
	
}
}
 