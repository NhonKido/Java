package E5_7;

public abstract class Store implements IStore {
	protected String brand;
	protected double weight, price;
	
	//no-argument constructor for sub-class
	public Store() {};
	
	@Override
	public String brandList() {
		return this.brand;
	}
	
}
