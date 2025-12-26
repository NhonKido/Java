package E4_6;

public class Coffee extends Store{
	//properties
	private String kind;
	
	/**
	 * 
	 * @param brand
	 * @param weight
	 * @param price
	 * @param IsRegular
	 */
	public Coffee(String brand , double weight, double price,boolean IsRegular) {
		this.brand = brand;
		this.weight = weight;
		this.price = price;
		if(IsRegular) {this.kind = "regular";}
		else {this.kind = "decaffeinated";}
	}
	


	
}