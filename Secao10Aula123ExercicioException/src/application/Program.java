package application;

import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.DomainException;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		try {
			System.out.print("Entre numero da conta: ");
			int numero = sc.nextInt();
			sc.nextLine();
						
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Deposito Inicial:");			
			double depositoInicial=sc.nextDouble();
						
			System.out.print("Limite Saque:");
			double limite=sc.nextDouble();		
										
			
			Conta conta= new Conta(numero, depositoInicial, nome, limite);
						
			System.out.println();
			System.out.print("Entre valor saque: ");
			conta.saque(sc.nextDouble());
						
		}
	
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Valor incorreto");
		}

		sc.close();
	}
}