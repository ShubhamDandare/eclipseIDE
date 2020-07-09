package entry;

import java.sql.SQLException;
import java.util.Scanner;

import entity.ProductEntity;
import service.ProductService;

public class ProductEntry {
	Scanner sc= new Scanner(System.in);
	
public void getUserProduct() throws ClassNotFoundException, SQLException {
	System.out.println("enter the productid=");
	int Productid = Integer.parseInt(sc.nextLine());
	System.out.println("enter the ProductName=");
	String ProductName=sc.nextLine();
	System.out.println("enter the productPrice=");
	String ProductPrice=sc.nextLine();
	System.out.println("enter the productquantity=");
	String ProductQuantity=sc.nextLine();
	System.out.println("enetr the producttype=");
	String ProductType=sc.nextLine();
	 
	ProductEntity pe= new ProductEntity();
	pe.setProductId(Productid);
	pe.setProductName(ProductName);
	pe.setProductPrice(ProductPrice);
	pe.setProductQuantity(ProductQuantity);
	pe.setProductType(ProductType);
	
	ProductService ps= new ProductService();
	ps.InsertProduct(pe);
}
}
