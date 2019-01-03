package entities;

public class ItemPedido {
	
	private Integer quantity;
	private Double price;	
	
	private Produto produt;		
		
	public ItemPedido(Integer quantity, Produto produt) {		
	
		this.quantity = quantity;
		this.price = produt.getPrice();
		this.produt = produt;
	}

	public Double subTotal(){
		return produt.getPrice()*quantity;				
	}

	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Produto getProdut() {
		return produt;
	}

	public void setProdut(Produto produt) {
		this.produt = produt;
	}
	
	@Override
	public String toString() {
		return produt.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}
