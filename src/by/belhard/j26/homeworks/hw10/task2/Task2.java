package by.belhard.j26.homeworks.hw10.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {

		try {
			BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter number of products: ");
			int lineCount = Integer.parseInt(rdr.readLine());

			List<Product> productsInput = new ArrayList<>();

			System.out.println("Enter product data by template:\ntitle\tprice(double)\tquantity(int)");
			for (int i = 0; i < lineCount; i++) {
				String[] splitted = rdr.readLine().split(" ");
				String name = splitted[0];
				double price;
				int quantity;

				try {
					price = Double.parseDouble(splitted[1]);
					quantity = Integer.parseInt(splitted[2]);
					if (quantity <= 0 || price < 0)
						throw new RuntimeException();
				} catch (RuntimeException e) {
					System.err.println("Invalid input");
					i--;
					continue;
				}

				productsInput.add(new Product(name, price, quantity));
			}

			double sum = productsInput.stream().mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();
			System.out.printf("Total: %.2f\n", sum);

			rdr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
