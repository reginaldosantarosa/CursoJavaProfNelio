package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.AluguelService;
import model.services.BrasilTaxService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in)	;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm");
		
		System.out.println("Enter aluguel carro:");
		
		System.out.print("Carro modelo: ");
		String modelo = sc.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		Date inicio = sdf.parse(sc.nextLine());

		System.out.print("Eentrega (dd/MM/yyyy HH:mm): ");
		Date fim = sdf.parse(sc.nextLine());
		
		
		
		AluguelCarro aluguelCarro = new AluguelCarro(inicio, fim, new Veiculo(modelo));
		
		System.out.print("Entre preco por hora: ");
		double precoPorHora = sc.nextDouble();
		
		System.out.print("Entre preco por dia: ");
		double precoPorDia = sc.nextDouble();
		
		
		AluguelService  aluguelServico = new AluguelService(precoPorDia, precoPorHora, new  BrasilTaxService());
		aluguelServico.processandoFatura(aluguelCarro);
		
		System.out.println("\nALUGUEL:");
		System.out.println("Pagamento basico: " + String.format("%.2f", aluguelCarro.getFatura().getBasicoPagamento()));
		System.out.println("Taxa: " + String.format("%.2f", aluguelCarro.getFatura().getTaxa()));
		System.out.println("Total pagamento: " + String.format("%.2f", aluguelCarro.getFatura().getTotalPagamento()));
		
		
		sc.close();
	}

}
