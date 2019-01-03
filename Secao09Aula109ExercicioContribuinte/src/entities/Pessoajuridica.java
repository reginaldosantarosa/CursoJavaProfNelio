package entities;

public class Pessoajuridica  extends Contribuinte{
	
	private int numeroFuncionario;

	public Pessoajuridica(String nome, Double rendaAnual, int numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}
	
	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}


	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}
	
	
	@Override
	public Double imposto() {
	 if (getNumeroFuncionario() > 10) {
			 return getRendaAnual()*0.14;
	 }
	 else {		
		 	return getRendaAnual()*0.16;
		 }

	}

	
	
		
	
	

}
