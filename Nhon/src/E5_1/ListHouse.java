package E5_1;

public class ListHouse implements IHouse {
	//properties
	private AHouse First_house;
	private IHouse rest;
	/**
	 * constructor
	 * @param first_house
	 * @param rest
	 */
	public ListHouse(AHouse first_house, IHouse rest) {
		First_house = first_house;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return this.First_house.toString() + this.rest.toString();
	}
	
	
}
