package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import QuerryUtility.UserCreateQuerry;
import entity.BuyEntity;
import entity.CartEntity;
import utility.PreparedUtility;

public class BuyService {

	public void getBuyFromUser(String userId) throws ClassNotFoundException, SQLException {
		try {
			Connection connection = PreparedUtility.getConnection();
			PreparedStatement pdstm = connection.prepareStatement(UserCreateQuerry.GET_CART_BY_USERID);
			pdstm.setString(1, userId);
			ResultSet rs = pdstm.executeQuery();
              
			int totalproductPrice = 0;
			int sum = 0;
			String dbUserName=null;
			
			while (rs.next()) {
				
				totalproductPrice = Integer.parseInt(rs.getString("ProductPrice"))
						* Integer.parseInt(rs.getString("ProductQuantity"));
				System.out.println("product name="+rs.getString("ProductName"));
				System.out.println("product price="+Integer.parseInt(rs.getString("ProductPrice")));
				System.out.println("product quantity="+Integer.parseInt(rs.getString("ProductQuantity")));
				sum = sum + totalproductPrice;
				dbUserName=rs.getString("name");	
				if(Integer.parseInt(rs.getString("CartQuantity"))>=Integer.parseInt(rs.getString("ProductQuantity"))) {
					System.out.println("plz enter the minimum num of product");
				}
			}
			System.out.println("==================================================================================");
			System.out.println("user name ="+dbUserName);
			System.out.println("=================================================================================");
			System.out.println("total sum of product=" + sum);
			
		
		/*	String sql="delete from cart where UserId=?";
			PreparedStatement pdstm1= connection.prepareStatement(sql);
			pdstm1.setString(1, userId);
			 pdstm1.executeUpdate(); */
			
			
			
			
			
		} catch (NumberFormatException e) {
          e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}