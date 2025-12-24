package E5_14;

public class ConsLocation implements ILocation{
	private Location first;
	private ILocation rest;

	public ConsLocation(Location first, ILocation rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	
	@Override
	public String toString() {
		String restStr = (this.rest == null) ? "null" : this.rest.toString();
		return "[" + this.first.toString() + ", " + restStr + "]";
	}

}