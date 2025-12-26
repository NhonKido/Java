package E4_3;

public class Subways extends AVehicles{
	//properties
	private int nPeopleCarry; //for subways only carry people
	private long amountContain; //for subways only contain goods
	private int speed;
	//constructor for carry people subways
	public Subways(double price, String VehiclesName,boolean used,int nPeopleCarry, int speed) {
		this.price = price;
		this.VehiclesName = VehiclesName;
		this.used = used;
		this.nPeopleCarry = nPeopleCarry;
		this.speed = speed;
	}
	//constructor for contain stuff subways
	public Subways(double price, String VehiclesName,boolean used,long amountContain, int speed) {
		this.price = price;
		this.VehiclesName = VehiclesName;
		this.used = used;
		this.amountContain = amountContain;
		this.speed = speed;
	}
}
