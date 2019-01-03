package init;

import java.util.Locale;
import java.util.Scanner;

import execute.Retangulo;

public class Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.print("informe a largura: ");
		
		retangulo.width=sc.nextDouble();
		System.out.print("informe a altura: ");
		retangulo.height= sc.nextDouble();
		
		System.out.printf("Area é %.2f%n",retangulo.area());
		System.out.printf("Perimetro é %.2f%n",retangulo.perimeter());
		System.out.printf("Diagonal é %.2f%n",retangulo.diagonal());
		sc.close();
	}

}
