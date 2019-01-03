package appliccation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Programam {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // nao aceita tipos primitivos
		// List<String> list = new ArrayList<String>(); // opcional

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marcos");
		
		
		String name=list.stream().filter(x-> x.charAt(1)=='T').findFirst().orElse(null);
		
		System.out.println("busca "+name);
		
		System.out.println(list.indexOf("Bobw"));
				
		//stream  permite usar as expressões lambda a seguir
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

		System.out.println("-----------");
		for (String x : result) {

			System.out.println(x);

		}

		System.out.println(list.size());
		list.remove("Anna");
		list.remove(1);

		for (String x : list) {

			System.out.println(x);

		}

		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {

			System.out.println(x);

		}

	}

}
