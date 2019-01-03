package model.entities;

public class Fatura {
	
	private double basicoPagamento;
	private Double taxa;
	
	public Fatura(double basicoPagamento, Double taxa) {
		this.basicoPagamento = basicoPagamento;
		this.taxa = taxa;
	}
	public double getBasicoPagamento() {
		return basicoPagamento;
	}
	public void setBasicoPagamento(double basicoPagamento) {
		this.basicoPagamento = basicoPagamento;
	}
	public Double getTaxa() {
		return taxa;
	}
	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	
	public Double getTotalPagamento() {
		return getBasicoPagamento() + getTaxa();
	}

}
