package onClass;

public class Coffee extends AStore{
	private boolean isDecaffein;
	
	public Coffee(String brand, String name, double weight, double price, boolean isDecaffein) {
		super(brand, name, weight, price);
		this.isDecaffein = isDecaffein;
	}
	
	public String getType() {
		if(this.isDecaffein) {return "decaffeinated";}
		return "regular";
		
	}

	

}
