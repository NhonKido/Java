package E4_7;

public class Limo extends ATaxiVehicle { 
	//properties 
	private int minRental;
	/**
	 * constructor
	 * @param idNum
	 * @param passengers
	 * @param pricePerMile
	 * @param minRental
	 */
	public Limo(int idNum, int passengers, int pricePerMile, int minRental) {
		super(idNum, passengers, pricePerMile);
		this.minRental = minRental;
	}
	
	@Override
	public int Fare(int miles) {
		return Math.max(this.minRental, this.pricePerMile*miles);
	}
	
}