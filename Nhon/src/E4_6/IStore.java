package E4_6;

public interface IStore {
	double unitPrice();
	boolean lowerPrice(double amount);
	boolean cheaperThan(double cost);
}
