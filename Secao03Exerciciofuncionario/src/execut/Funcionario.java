package execut;

public class Funcionario {
	
	public double salario;
	public String nome;
	public double taxa;
	
	public double salarioLiquido() {
		return salario-taxa;
				
	}

	
	public void aumento(double percentual) {
		salario+=salario*(percentual/100) - taxa;
		
		
	}
	
	public String toString() {
		return String.format("Employee: %s, $ %.2f%n",nome,salarioLiquido()); 
		
		
	}
}
