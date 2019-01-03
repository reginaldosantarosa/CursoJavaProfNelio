package entities;

public class Pessoafisica extends Contribuinte {

	private Double gastosSaude;

	public Pessoafisica() {

	}

	public Pessoafisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastoSaude;
	}

	
	
	
	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	public Double deducaoSaude() {
		return getGastosSaude()*0.5;
	}
	
	@Override
	public Double imposto() {
	 if (getRendaAnual() < 20_000) {
			 return getRendaAnual()*0.15 - deducaoSaude();
	 }
	 else {		
		 	return getRendaAnual()*0.25 - deducaoSaude();					 
		 }

	}

}
