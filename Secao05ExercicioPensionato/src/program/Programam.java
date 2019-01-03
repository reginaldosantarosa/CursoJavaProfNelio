package program;

import java.util.Locale;
import java.util.Scanner;

public class Programam {

	public static void main(String[] args) {

		
		String[] vect= new String[] {"Maria","Bob","Alex"};
		
		for (String x : vect) {
			
			System.out.println(x);
			
		}
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n=10;
		Aluguel[] aluguel= new Aluguel[n];
		
		for (int i=0;i<3;i++) {
		
		System.out.println("Informe nome: ");
		String nome=sc.nextLine();
		
		System.out.println("Informe email: ");
		String email=sc.nextLine();		
		
		System.out.println("Informe quarto: ");
		int numeroQuarto=sc.nextInt();
		sc.nextLine();
		
		aluguel[numeroQuarto]=new Aluguel(nome, email, numeroQuarto);
		
		}
		
		for (int i=0;i< aluguel.length;i++) {
			if (aluguel[i]!=null){
				System.out.println( i + ": " + aluguel[i].getNome() + " , " + aluguel[i].getEmail());				
			}
			
		}
		
		sc.close();
	}

}
