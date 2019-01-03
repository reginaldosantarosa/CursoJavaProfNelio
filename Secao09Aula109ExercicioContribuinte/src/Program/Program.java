package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Pessoafisica;
import entities.Pessoajuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();

		System.out.println("Entre com numero de contribuintes");
		int n= sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Pessoal Fisica  Juridica (f/j)?");
			char c = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome:");
			String nome=sc.nextLine();
			
			System.out.println("Renda Anual ");
			double rendaAnual=sc.nextDouble();
			
			if (c=='f') {
				System.out.println("Gasto com Saude ");
				double gastoSaude=sc.nextDouble();
				
				list.add(new Pessoafisica(nome, rendaAnual, gastoSaude));
				
			}
			
			else {
				System.out.println("Numero de Funcionarios ");
				int numeroFuncionario=sc.nextInt();				
				list.add(new Pessoajuridica(nome, rendaAnual, numeroFuncionario));
				
				
			}
			
			
		}
		
		System.out.println("Taxas:");
		
		double sun=0.0;
		for (Contribuinte c : list) {
			System.out.printf(c.getNome() + ": $" + String.format("%.2f\n",c.imposto()));
			sun+=c.imposto();
		}
		
		System.out.println("Total Taxas: $" + String.format("%.2f",sun));
		sc.close();

	}

}
