package E4_7;

public class Van extends ATaxiVehicle { //properties
	private boolean access;
	
	/**
	 * constructor
	 * @param idNum
	 * @param passengers
	 * @param pricePerMile
	 * @param access
	 */
	public Van(int idNum, int passengers, int pricePerMile, boolean access) {
		super(idNum, passengers, pricePerMile);
		this.access = access;
	}

	@Override
	public int Fare(int miles) {
		return this.pricePerMile*miles + this.passengers;
	}

}