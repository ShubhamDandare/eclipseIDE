package com.Entity;

public class shopingEntity {
private String shopingId;
private String shopingName;
private String shopingProduct;
private String shopingcost;
public String getShopingId() {
	return shopingId;
}
public void setShopingId(String shopingId2) {
	this.shopingId = shopingId2;
}
public String getShopingName() {
	return shopingName;
}
public void setShopingName(String shopingName2) {
	this.shopingName = shopingName2;
}
public String getShopingProduct() {
	return shopingProduct;
}
public void setShopingProduct(String shopingProduct) {
	this.shopingProduct = shopingProduct;
}
public String getShopingcost() {
	return shopingcost;
}
public void setShopingcost(String shopingcost) {
	this.shopingcost = shopingcost;
}
@Override
public String toString() {
	return "shopingEntity [shopingId=" + shopingId + ", shopingName=" + shopingName + ", shopingProduct="
			+ shopingProduct + ", shopingcost=" + shopingcost + "]";
}
public shopingEntity(String shopingId, String shopingName, String shopingProduct, String shopingcost) {
	super();
	this.shopingId = shopingId;
	this.shopingName = shopingName;
	this.shopingProduct = shopingProduct;
	this.shopingcost = shopingcost;
}
public shopingEntity() {
	super();
	// TODO Auto-generated constructor stub
}

}
