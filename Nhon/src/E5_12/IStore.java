package E5_12;

public interface IStore {
	double unitPrice();
	boolean lowerPrice(double amount);
	boolean cheaperThan(double cost);
	String brand();
}
