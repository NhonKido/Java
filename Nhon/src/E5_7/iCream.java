package E5_7;

public class iCream extends Store{
	//properties
	private String flavor;
	/**
	 * constructor
	 * @param brand
	 * @param weight
	 * @param price
	 * @param flavor, 1: sorbet . 2: frozen yogurt . 3: regular ice cream .
	 */
	public iCream(String brand, double weight, double price, int flavorCODE) {
		this.brand = brand;
		this.weight = weight;
		this.price = price;
		switch(flavorCODE) {
			case 1: this.flavor = "sorbet";break;
			case 2: this.flavor = "frozen yogurt"; break;
			case 3: this.flavor = "regular ice cream"; break;
			default: this.flavor = "regular ice cream"; break;
		}
	}
	@Override
	public double unitPrice() {return this.price/this.weight;}
	@Override
	public boolean lowerPrice(double amount) {return this.unitPrice() < amount;}
	@Override
	public boolean cheaperThan(double cost) {return this.price < cost;}
	
	
	
}
