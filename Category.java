package task.six;

import java.util.ArrayList;

public class Category {
	public String name;
	private ArrayList<Product> products;
	Category(String name){
		this.name = name;
		products = new  ArrayList<Product>();
	}
	void addProduct(Product p) {
		products.add(p);
	}
	Product getProduct(int i) {
		int size = products.size();
		if (i >= size)
		return null;
		return products.get(i);
	}
	
	
}

