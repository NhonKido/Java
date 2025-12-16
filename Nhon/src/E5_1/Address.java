package E5_1;

public class Address {
	//properties
	private int houseNum;
	private String streetName, city;
	/**
	 * constructor
	 * @param houseNum
	 * @param streetName
	 * @param city
	 */
	public Address(int houseNum, String streetName, String city) {
		this.houseNum = houseNum;
		this.streetName = streetName;
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("\thouse num: %s \t street name: %s \t city: %s \n",this.houseNum,this.streetName,this.city);
	}
	
}
