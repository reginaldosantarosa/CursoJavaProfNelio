package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double min = 100.0;
        
		//referecnia para metodos
		//list.removeIf(Product::staticProductPredicate);
		
		//list.removeIf(Product::noticProductPredicate);
		
		//list.removeIf(new ProductPredicate());
		
		//Predicate<Produt> pred = p -> p.getPrice()>=100;
		
		list.removeIf(p -> p.getPrice() >= min);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
