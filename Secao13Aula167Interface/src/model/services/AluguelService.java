package model.services;

import model.entities.AluguelCarro;
import model.entities.Fatura;

//renalService
public class AluguelService {

	private Double precoPorDia;
	private Double precoPorHora;
	
	private BrasilTaxService taxaServico ;

	public AluguelService(Double precoPorDia, Double precoPorHora, BrasilTaxService taxaServico) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaServico = taxaServico;
	}
	
	//vai gerar a nota de pagamento
	//AluguelCarro = carRental
	
	public void processandoFatura(AluguelCarro aluguelCarro) {
		
		long t1 =aluguelCarro.getInicio().getTime(); //horas em milsegundos
		long t2 =aluguelCarro.getFim().getTime();		
		double pagamentoBasico;
		double horas=(double) (t2-t1)/1000/60/60;
		
		if (horas <= 12.0) {
			pagamentoBasico = Math.ceil(horas) * precoPorHora;
		}
		else {
			pagamentoBasico = Math.ceil(horas/24) * precoPorDia;
		}
		
		
		double taxa = taxaServico.taxa(pagamentoBasico);
		aluguelCarro.setFatura(new Fatura(pagamentoBasico,taxa));
		
	}
	
}
