package services;

import java.security.InvalidParameterException;

public interface EmprestimoService {

	double getTaxaEmprestimo();

	
	default double pagamento(double montante, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return montante * Math.pow(1.0 + getTaxaEmprestimo() / 100.0, meses);
	}
}
