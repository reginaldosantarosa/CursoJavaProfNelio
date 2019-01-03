package Programam;

import java.util.Locale;
import java.util.Scanner;

import utilits.Conta;

public class Programam {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	    Conta conta;
		
		System.out.print("Numero da conta: ");
		int numero= sc.nextInt();
		sc.nextLine();
		
		System.out.print("Nome: ");
		String nome=sc.nextLine();
		
		System.out.print("Quer fazer um deposto inicial? <s/n> : ");
		char c= sc.next().charAt(0);
		
		if (c=='s'){
			System.out.println("Desposito: ");
			double deposito=sc.nextDouble();	
			conta = new Conta(nome, numero, deposito);
			System.out.println(conta);
		}
		
		else {
			conta = new Conta(nome, numero);
			System.out.println(conta);
		}	
	
		
		
		System.out.println("Novo Deposito: ");
		conta.depositar(sc.nextDouble());
		
		System.out.println("Novo Saque: ");
		conta.sacar(sc.nextDouble());
		
		
		sc.close();

	}

}
