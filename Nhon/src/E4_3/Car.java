package E4_3;

public class Car extends AVehicles{
	//properties
	private String kind; //sport car, suv, minivan...
	private int HP; //hoursePower
	//constructor
	public Car(double price, String VehiclesName,boolean used, String kind, int HP) {
		this.price = price;
		this.VehiclesName = VehiclesName;
		this.used = used;
		this.kind = kind;
		this.HP = HP;
	}
	
	
}
