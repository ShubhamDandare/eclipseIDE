package entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CartEntity {
private int CartId;
private int UserId;
private int ProductId;
private int CartQuantity;
public int getCartId() {
	return CartId;
}
public void setCartId(int cartId) {
	CartId = cartId;
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
public int getCartQuantity() {
	return CartQuantity;
}
public void setCartQuantity(int cartQuantity) {
	CartQuantity = cartQuantity;
}
@Override
public String toString() {
	return "CartEntity [CartId=" + CartId + ", UserId=" + UserId + ", ProductId=" + ProductId + ", CartQuantity="
			+ CartQuantity + "]";
}
public CartEntity(int cartId, int userId, int productId, int cartQuantity) {
	super();
	CartId = cartId;
	UserId = userId;
	ProductId = productId;
	CartQuantity = cartQuantity;
}
public CartEntity() {
	super();
	// TODO Auto-generated constructor stub
}

}
