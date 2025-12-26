package E4_3;

public class Bus extends AVehicles{
	//properties
	private int nPeopleCarry;
	private boolean ElectricBus;
	//constructor
	public Bus(double price, String VehiclesName,boolean used,int nPeopleCarry, boolean ElectricBus) {
		this.price = price;
		this.VehiclesName = VehiclesName;
		this.used = used;
		this.nPeopleCarry = nPeopleCarry;
		this.ElectricBus = ElectricBus;
	}
	
	
	
}
