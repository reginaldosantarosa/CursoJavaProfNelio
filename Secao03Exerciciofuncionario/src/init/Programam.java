package init;

import java.util.Locale;
import java.util.Scanner;

import execut.Funcionario;

public class Programam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Funcionario funcionario= new Funcionario();
		System.out.print("Nome: ");
		funcionario.nome=sc.nextLine();
		
		System.out.print("Salario: ");
		funcionario.salario=sc.nextDouble();
		
		System.out.print("Taxa: ");
		funcionario.taxa=sc.nextDouble();
		
		System.out.println(funcionario);
		
		System.out.print("Which percentage to increase salary? ");
		funcionario.aumento(sc.nextDouble());
				
		System.out.println("Update data: " + funcionario.nome + ", $ " + funcionario.salario);
		sc.close();
	}

}
