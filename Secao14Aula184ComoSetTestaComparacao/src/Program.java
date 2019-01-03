
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		//uma vez que Treeset lista ordenado, tem que implemntar o comparable <produto>
		//e na classe produto, criar metodo compareTo
		
		for (Product p : set) {
			System.out.println(p);
			}
	}
}