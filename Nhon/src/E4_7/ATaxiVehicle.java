package E4_7;

public abstract class ATaxiVehicle implements ITaxiVehicle {
	//properties
	protected int idNum, passengers, pricePerMile;
	/**
	 * constructor
	 * @param idNum
	 * @param passengers
	 * @param pricePerMile
	 */	
	public ATaxiVehicle(int idNum, int passengers, int pricePerMile) {
		this.idNum = idNum;
		this.passengers = passengers;
		this.pricePerMile = pricePerMile;
	}
	@Override
	public boolean lowerPrice(int miles, int amount) {
		return this.Fare(miles) < amount;
	}

	@Override
	public boolean cheaperThan(ITaxiVehicle other, int sameMile) {
		return this.Fare(sameMile) < other.Fare(sameMile);
	}
}