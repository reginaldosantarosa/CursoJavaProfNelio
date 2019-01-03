package services;

public class UsaEmprestimoService implements EmprestimoService {

	private double taxaEmprestimo;

	public UsaEmprestimoService(double taxaEmprestimo) {
		this.taxaEmprestimo = taxaEmprestimo;
	}

	@Override
	public double getTaxaEmprestimo() {
		return taxaEmprestimo;
	}
}
