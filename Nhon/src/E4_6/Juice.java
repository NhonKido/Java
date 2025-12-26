package E4_6;

public class Juice extends Store{
	//properties
	private String flavor;
	
	/**
	 * 
	 * @param brand
	 * @param weight
	 * @param price
	 * @param flaverCODE, 1: frozen . 2: fresh . 3: bottled . 4: canned .
	 */
	public Juice(String brand , double weight, double price,int flavorCODE) {
		this.brand = brand;
		this.weight = weight;
		this.price = price;
		switch(flavorCODE){
		case 1:
			this.flavor = "frozen"; break;
		case 2:
			this.flavor = "fresh"; break;
		case 3:
			this.flavor = "bottled"; break;
		case 4:
			this.flavor = "canned"; break;
		default: this.flavor = "frozen"; break;
	}
	}
	
	
}
