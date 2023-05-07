package task.six;

public class Product {
	public String name;
	private float price;
	private float rating;

	Product(String name, float price){
		this.name = name;
		this.setPrice(price);
		rating = 0;
	}

	public float getRating() {
		return rating;
	}
	public boolean setRating(float rating) {
		if (rating >= 0 && rating <= 5) {
			this.rating = rating;
			return true;
		}
		return false;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void print() {
		System.out.println("Название товара: " + this.name + "\nЦена: " +  this.price + "\nРейтинг: " +  this.rating );
	}

}
