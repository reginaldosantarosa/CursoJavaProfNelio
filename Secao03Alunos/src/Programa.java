
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double[] n = new double[3];
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		
		aluno.nome=sc.nextLine();
		System.out.print("informe as tres notas: ");
		
		n[0]=sc.nextDouble();
		n[1]=sc.nextDouble();
		n[2]=sc.nextDouble();
		
		aluno.notas=n;
		aluno.analise();
		sc.close();
	}

}
