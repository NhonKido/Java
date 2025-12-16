package E5_7;

public interface IStore {
	double getPrice = 0;
	public double unitPrice();
	public boolean lowerPrice(double amount);
	public boolean cheaperThan(double cost);
	public String brandList();
	
}
