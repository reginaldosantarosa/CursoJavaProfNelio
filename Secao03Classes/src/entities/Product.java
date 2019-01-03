package entities;

public class Product {
	
	public String name;
	public Double price;
	public int quantity;
	
	public Product() {
				
	}

	public Product(String name, Double price, int quantity) {
	
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, Double price) {
		
		this.name = name;
		this.price = price;
		
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	public double totalValueStock() {
		return price * quantity;

	}
	
	public void addProducts(int quantity) {
		this.quantity+=quantity;
				
	}
	
	public void removeProducts(int quantity) {
		this.quantity-=quantity;
		
	}
	
	public String toString() {
		
		return name
				+ ", $ "
				+ String.format("%.2f",price)
				+ ", "
				+ quantity
				+" units, Total $ "
				+ String.format("%.2f",totalValueStock());
	}
}
