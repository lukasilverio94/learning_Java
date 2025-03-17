package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double factor = 1.1; // we will apply this to increase 10% to all products
		
		Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * factor);
		list.forEach(consumer);
		
		list.forEach(System.out::println);
		
	}

}