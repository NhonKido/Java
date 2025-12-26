package E4_7;

public interface ITaxiVehicle {
	public int Fare(int miles);
	public boolean lowerPrice(int miles, int amount);
	public boolean cheaperThan(ITaxiVehicle other, int sameMiles);
}
