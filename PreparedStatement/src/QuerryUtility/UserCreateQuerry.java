package QuerryUtility;

public class UserCreateQuerry {
	
	/***** Products Query **********/
	public static final String InserProductQuerry = "insert into Product (ProductId,ProductName,ProductPrice,ProductQuantity,ProductType) values(?,?,?,?,?)";
	public static final String CreateProductQuerry = "Create Table Product (ProductId  int not null auto_increment,ProductName varchar(100),ProductPrice varchar(100),ProductQuantity varchar(100),ProductType varchar(100),Primary key(ProductId))";
	
	
	/******* Cart Query ********/
	public static final String InsertCartQuerry = "insert into Cart (CartId,UserId,ProductId,CartQuantity) values(?,?,?,?)";
	public static final String CreateCartTable = "Create Table Cart (CartId  int not null auto_increment,UserId int (10),ProductId int (10),CartQuantity int(100),Primary key(CartId))";
	public static final String GET_CART_BY_USERID = "select * from cart c  " + 
												  "inner join user u ON c.UserId = u.id " + 
												  "inner join product p on c.ProductId = p.ProductId " + 
												  "where c.UserId = ? ";

}
