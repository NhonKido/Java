package E5_1;

public class AHouse{
	//properties
	protected String kind;
	protected int roomNum;
	protected double askingPrice;
	protected Address address;
	/**
	 * constructor
	 * @param kind
	 * @param roomNum
	 * @param askingPrice
	 * @param address
	 */
	public AHouse(String kind, int roomNum, double askingPrice, Address address) {
		this.kind = kind;
		this.roomNum = roomNum;
		this.askingPrice = askingPrice;
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("kind: %s \t room number: %s \t asking price: %s \t "
				,this.kind, this.roomNum, this.askingPrice) 
				+ this.address.toString();
	}
	
}
