package Collectiondemo;

public class Dish {
private String name;
private int price;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Dish [name=" + name + ", price=" + price + "]";
}
public Dish() {
	super();
	// TODO Auto-generated constructor stub
}

}
