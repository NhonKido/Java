package onClass;

public class Icream extends AStore{
	private int FlavorTypeCode;
	
	/**
	 * 
	 * @param brand
	 * @param name
	 * @param weight
	 * @param price
	 * @param FlavorTypeCode {1: sorbet, 2: frozen yogurt, 3: regular}
	 */
	public Icream(String brand, String name, double weight, double price, int FlavorTypeCode) {
		super(brand, name, weight, price);
		this.FlavorTypeCode = FlavorTypeCode;
	}
	
	public String getPackageType() {
		switch (FlavorTypeCode) {
		case 1:
			return "sorbet";
		case 2:
			return "yogurt";
		case 3:
			return "regular";
		default:
			return "no flavor type match";
		}
	}

}
