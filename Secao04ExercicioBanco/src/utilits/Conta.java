package utilits;

public class Conta {
	private String nome;
	private int numero;
	private double saldo;

	public Conta() {	

	}
	
	
	public Conta(String nome, int numero) {

		this.nome = nome;
		this.numero = numero;
		

	}

	public Conta(String nome, int numero, double depositoInicial) {

		this.nome = nome;
		this.numero = numero;
		depositar(depositoInicial);		
	}

	public void setNome(String Nome) {
		this.nome = Nome;
	}

	public String getNome() {
		return nome;
	}
	public void depositar(double deposito) {
		saldo += deposito;
		System.out.printf("Novo Saldo: %.2f%n", saldo);
	}

	public void sacar(double saque) {
		if (saldo < saque + 5)
			System.out.println("Sem Saldo Sufciente!");
		else {
			saldo -= saque - 5;
			System.out.printf("Novo Saldo: %.2f%n", saldo);
		}

	}
	
	
	public String toString() {
		
		return "Nome: " + nome + "Numero " + "Saldo: " +  String.format("%.2f",saldo);
		
		
	}

}
