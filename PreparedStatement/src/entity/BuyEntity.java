package entity;

public class BuyEntity {
private int BuyId;
private int UserId;
private int ProductId;
private String CartList;
public int getBuyId() {
	return BuyId;
}
public void setBuyId(int buyId) {
	BuyId = buyId;
}
public int getUserId() {
	return UserId;
}
public void setUserId(int userId) {
	UserId = userId;
}
public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getCartList() {
	return CartList;
}
public void setCartList(String cartList) {
	CartList = cartList;
}
@Override
public String toString() {
	return "BuyEntity [BuyId=" + BuyId + ", UserId=" + UserId + ", ProductId=" + ProductId + ", CartList=" + CartList
			+ "]";
}
public BuyEntity(int buyId, int userId, int productId, String cartList) {
	super();
	BuyId = buyId;
	UserId = userId;
	ProductId = productId;
	CartList = cartList;
}
public BuyEntity() {
	super();
	// TODO Auto-generated constructor stub
}

}
