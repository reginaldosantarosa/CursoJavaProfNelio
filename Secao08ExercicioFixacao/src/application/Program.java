package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.ItemPedido;
import entities.Produto;
import entities.enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Cliente client = new Cliente(name, email, birthDate);
		
		System.out.println("Entre dados pedido:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, client);
		
		System.out.print("Quantos itens tem o pedido? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Entre #" + i + " itens:");
			System.out.print("Nome: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Preço: ");
			double productPrice = sc.nextDouble();

			Produto product = new Produto(productName, productPrice);

			System.out.print("Quantidade: ");
			int quantity = sc.nextInt();

			ItemPedido orderItem = new ItemPedido(quantity,  product); 

			pedido.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("Descricao pedidos:");
		System.out.println(pedido);
		
		sc.close();
	}
}