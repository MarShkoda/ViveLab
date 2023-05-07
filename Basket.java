package task.six;

import java.util.ArrayList;

public class Basket {
	private ArrayList<Product> products;
	
	Basket(){
		products = new ArrayList<Product>();
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
	void print() {
		for (var p : products) {
			p.print();
		}
	}
}
