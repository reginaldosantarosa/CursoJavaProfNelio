package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		//map aplica uma funcao para cada elemento da stream	
		//List<String> names =list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		//Function<Product,String> func = p-> p.getNome().toUpperCase();
		
		//List<String> names = list.stream().map(func)).collect(Collectors.toList());
		
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
