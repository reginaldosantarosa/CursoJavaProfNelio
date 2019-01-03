public class Aluno {
	public String nome;
	public double[] notas;
	
	
	public void analise() {
		double soma=0.0;
		for(int i=0;i<3;i++) {
			soma+=notas[i];
			
		}
		System.out.println("final grade " + soma);
		if (soma>=60.0) System.out.println("passad");
				
		else {
			System.out.println("falied");
			System.out.println("MIISING " + (60.0-soma));
			
		}
	}
	
	
}
