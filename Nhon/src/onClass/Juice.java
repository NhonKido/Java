package onClass;

public class Juice extends AStore{
	private String flavor;
	private int packageTypeCode;
	
	/**
	 * 
	 * @param brand
	 * @param name
	 * @param weight
	 * @param price
	 * @param flavor {1: frozen, 2: fresh, 3: bottled, 4: canned}
	 * @param packageTypeCode
	 */
	public Juice(String brand, String name, double weight, double price, String flavor, int packageTypeCode) {
		super(brand, name, weight, price);
		this.flavor = flavor;
		this.packageTypeCode = packageTypeCode;
	}
	
	public String getPackageType() {
		switch (packageTypeCode) {
		case 1:
			return "frozen";
		case 2:
			return "fresh";
		case 3:
			return "bottled";
		case 4:
			return "canned";
		default:
			return "no package type match";
		}
	}
	
	
}
