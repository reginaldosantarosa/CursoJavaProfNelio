package services;

public class BrazilEmprestimoService implements EmprestimoService {

	private double taxaEmprestimo;

	public BrazilEmprestimoService(double taxaEmprestimo) {
		this.taxaEmprestimo = taxaEmprestimo;
	}

	@Override
	public double getTaxaEmprestimo() {
		return taxaEmprestimo;
	}
}
