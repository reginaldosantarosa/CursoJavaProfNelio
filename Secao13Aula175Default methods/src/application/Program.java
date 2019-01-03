package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilEmprestimoService;
import services.EmprestimoService;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Emprestimo: ");
		double montante = sc.nextDouble();
		
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		EmprestimoService emprestimoServicos = new BrazilEmprestimoService(2.0);
		double pagamento = emprestimoServicos.pagamento(montante, meses);
		
		System.out.println("Pagamento apos " + meses + " meses:");
		System.out.println(String.format("%.2f", pagamento));
		
		sc.close();
	}
}
