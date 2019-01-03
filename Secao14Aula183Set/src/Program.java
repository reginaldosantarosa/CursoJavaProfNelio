/*
//Demo 1

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Program {
	public static void main(String[] args) {
		
		//HashSet mais rapida
		Set<String> set = new HashSet<>();
		
		//intermediario
		//Set<String> set = new LinkedHashSet()<>();
		
		//ordenado
		//Set<String> set = new TreeSet()<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		set.add("Tabletsdsd");
		
		set.removeIf(x -> x.length()>=3);
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}


*/

//Demo 2

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}
}
