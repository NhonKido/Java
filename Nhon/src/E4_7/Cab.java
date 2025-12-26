package E4_7;

public class Cab extends ATaxiVehicle {
	
	/**
	 * constructor
	 * @param idNum
	 * @param passengers
	 * @param pricePerMile
	 */
	public Cab(int idNum, int passengers, int pricePerMile) {
		super(idNum, passengers, pricePerMile);
	}

	@Override
	public int Fare(int miles) {
		return pricePerMile*miles;
	}


}