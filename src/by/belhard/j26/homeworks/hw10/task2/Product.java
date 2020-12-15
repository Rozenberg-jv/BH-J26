package by.belhard.j26.homeworks.hw10.task2;

public class Product {

	private final String title;
	private final double price;
	private final int quantity;

	public Product(String title, double price, int quantity) {

		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	public double getPrice() {

		return price;
	}

	public int getQuantity() {

		return quantity;
	}
}
