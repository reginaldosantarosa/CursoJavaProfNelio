
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		//se nao tiver implemntado em produto os equals e hard
		// ele usa o da memoria...por isso pode dizer que nao contem
		
		Product prod = new Product("Notebook", 1200.0);
		
		for (Product p : set) {
			System.out.println(p);
			}
	}
}