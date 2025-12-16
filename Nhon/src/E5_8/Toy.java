package E5_8;

public class Toy {
	//properties
	private String name;
	private double price;
	private String origin;
	/**
	 * constructor
	 * @param name
	 * @param price
	 * @param origin
	 */
	public Toy(String name, double price, String origin) {
		this.name = name;
		this.price = price;
		this.origin = origin;
	}
	
	public double getPrice() {return this.price;}
	public String getName() {return this.name;}
	public void replaceName() {
		if(this.name == "robot") {this.name = "r2d2";}
	}
}
