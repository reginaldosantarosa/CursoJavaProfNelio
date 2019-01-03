import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
					
		System.out.print("Real: ");
		double real=sc.nextDouble();
		
		System.out.print("dollar: ");
		double dolar=sc.nextDouble();
		double retorno=Calc.converter(real,dolar);
		
		System.out.print("Resultado " + retorno);

		sc.close();
	}

}

