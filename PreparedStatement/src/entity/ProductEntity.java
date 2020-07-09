package entity;

public class ProductEntity {
private int ProductId; 
private String ProductName;
private String ProductPrice;
private String ProductQuantity;
private String ProductType;
public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public String getProductPrice() {
	return ProductPrice;
}
public void setProductPrice(String productPrice) {
	ProductPrice = productPrice;
}
public String getProductQuantity() {
	return ProductQuantity;
}
public void setProductQuantity(String productQuantity) {
	ProductQuantity = productQuantity;
}
public String getProductType() {
	return ProductType;
}
public void setProductType(String productType) {
	ProductType = productType;
}
@Override
public String toString() {
	return "ProductEntity [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
			+ ", ProductQuantity=" + ProductQuantity + ", ProductType=" + ProductType + "]";
}
public ProductEntity(int productId, String productName, String productPrice, String productQuantity,
		String productType) {
	super();
	ProductId = productId;
	ProductName = productName;
	ProductPrice = productPrice;
	ProductQuantity = productQuantity;
	ProductType = productType;
}
public ProductEntity() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
