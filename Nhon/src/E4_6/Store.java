package E4_6;

public abstract class Store implements IStore {
	protected String brand;
	protected double weight, price;
	
	public Store() {};
	@Override
	public double unitPrice() {return this.price/this.weight;}
	@Override
	public boolean lowerPrice(double amount) {return this.unitPrice() < amount;}
	@Override
	public boolean cheaperThan(double cost) {return this.price < cost;}
}
