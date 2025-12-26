package E5_7;

public abstract class Store implements IStore {
	protected String brand;
	protected double weight, price;
	
	//no-argument constructor for sub-class
	public Store() {};
	
	@Override
	public String brandList() {
		return this.brand;
	}	@Override
	public double unitPrice() {return this.price/this.weight;}
	@Override
	public boolean lowerPrice(double amount) {return this.unitPrice() < amount;}
	@Override
	public boolean cheaperThan(double cost) {return this.price < cost;}
	
}
