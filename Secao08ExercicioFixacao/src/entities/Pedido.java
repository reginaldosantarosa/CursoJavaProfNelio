package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	private Date moment;
	private StatusPedido orderStatus;
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");	
		
	private Cliente client;
	private List<ItemPedido> orderItens= new ArrayList<>();

	public Pedido(Date moment, StatusPedido orderStatus,Cliente client) {		
		this.moment = moment;		
		this.orderStatus = orderStatus;
		this.client=client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}
	
	
	public void addItem(ItemPedido item) {
		orderItens.add(item);
	}
	

	public void removeItem(ItemPedido item) {
		orderItens.remove(item);				
	}

	public double total(){
		double x_total=0.0;
		for (ItemPedido r : orderItens) {
			x_total+=r.subTotal();			
		}
		return x_total;		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		
		sb.append("Order status: ");
		sb.append(orderStatus + "\n");
		
		sb.append("Client: ");
		//sb.append(client.getName() + " ");
		//sb.append(sdf2.format(client.getBirthDate()) + " - ");		
		//sb.append(client.getEmail() + "\n");
		sb.append(client + "\n");
		
		sb.append("Order items:\n");		
		
		for (ItemPedido o : orderItens) {			
			
			//sb.append(o.getProdut().getName() + " , ");			
			//sb.append(String.format("$ %.2f ", o.getPrice()));			
			//sb.append("Quantity: " + o.getQuantity() + ", ");			
			//sb.append("Subtotal: $ " + o.subTotal() + "\n");
			sb.append(o);
		}
		
		sb.append("Total price: $ " );
		sb.append(String.format("%.2f",total()));		
		
		return sb.toString();
	}
}


