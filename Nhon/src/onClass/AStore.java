package onClass;

public abstract class AStore {
	protected String brand,name;
	protected double weight,price;
	
	public AStore(String brand, String name, double weight, double price) {
		this.brand = brand;
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public double unitPrice() {
		return this.price/this.weight;
	}
	
}
