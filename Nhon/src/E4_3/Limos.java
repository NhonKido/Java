package E4_3;

public class Limos extends AVehicles{
	//properties
	private int nSeat;
	private String brand;
	//constructor
	public Limos(double price, String VehiclesName,boolean used,int nSeat, String brand) {
		this.price = price;
		this.VehiclesName = VehiclesName;
		this.used = used;
		this.nSeat = nSeat;
		this.brand = brand;
	}
	
}
