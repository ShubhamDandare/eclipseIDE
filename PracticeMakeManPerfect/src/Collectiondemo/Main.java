package Collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
	Dish dish3=new Dish();
	dish3.setName("gulabjamun");
	dish3.setPrice(50);
	
	Dish dish1=new Dish();
	dish1.setName("mutton");
	dish1.setPrice(250);
	
	Dish dish2=new Dish();
	dish2.setName("mixveg");
	dish2.setPrice(150);
	List<Dish> dish =new ArrayList<Dish>();
	dish.add(dish1);
	dish.add(dish2);
	dish.add(dish3);
	
	Order o=new Order();
	o.setDish(dish);
	int sum=0;
	for(Dish d: dish) {
		sum=sum+ d.getPrice();
		System.out.println(d.getName()+" , "+d.getPrice());
		
	}
	System.out.println("total sum  "  +  sum);
}
}
