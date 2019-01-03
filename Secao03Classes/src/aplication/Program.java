package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		
		System.out.println(product.name); 
		System.out.println(product.price); 
		System.out.println(product.quantity); 
		
		
		System.out.println("Enter prodcut data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();

		System.out.println("\nProduct " + product);
		System.out.println("Enter the number of products to be add is stock:");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println("\nProduct " + product);

		System.out.println("Enter the number of products to be remove is stock:");
		int remove = sc.nextInt();
		product.removeProducts(remove);

		System.out.println("\nProduct " + product);

		sc.close();

	}

}
