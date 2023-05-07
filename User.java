package task.six;

import java.util.Scanner;

public class User {
	public String login;
	private String password;
	private Basket basket;
	
	User(String login, String password){
		this.login = login;
		this.setPassword(password);
		 basket = new Basket();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void print() {
		System.out.println(this.login + " купил:");
		basket.print();
	}
	
	public void add(Product p) {
		basket.addProduct(p);
	}
	
	public static void main(String[] args) {
		Product skirt = new Product("Юбка", 800);
		Product dress = new Product("Платье", 1500);
		Product hat = new Product("Шляпа", 900);
		Category clothes = new Category("Одежда");
		clothes.addProduct(skirt);
		clothes.addProduct(dress);
		clothes.addProduct(hat);
		Product bread = new Product("Хлеб", 80);
		Product mashroom = new Product("Шампиньон", 200);
		Product chocolate = new Product("Шоколад", 90);
		Category food = new Category("Еда");
		food.addProduct(bread);
		food.addProduct(mashroom);
		food.addProduct(chocolate);
		hat.setRating(4);
		User user = new User("Джордан", "very_Str0ng_p2s$wor9");
		user.add(chocolate);
		user.add(hat);
		user.print();
	}
}

/*
▸ Создать класс Товар, имеющий переменные имя, цена, рейтинг
▸ Создать класс Категория, имеющий переменные имя и массив товаров
▸ Создать несколько объектов класса Категория
▸ Создать класс Basket, содержащий массив купленных товаров
▸ Создать класс User, содержащий логин, пароль и объект класса Basket
▸ Создать объект класса User*/