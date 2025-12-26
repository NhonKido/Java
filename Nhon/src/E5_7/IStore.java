package E5_7;

public interface IStore {
	public String brandList();
	public double unitPrice();
	public boolean lowerPrice(double amount);
	public boolean cheaperThan(double cost);
	
}
