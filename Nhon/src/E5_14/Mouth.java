package E5_14;

public class Mouth {
	//properties
	private Location location;
	private IRiver river;
	
	/**
	 * 
	 * @param location
	 * @param river
	 */
	public Mouth(Location location, IRiver river) {
		this.location = location;
		this.river = river;
	}
	
	public int howManySource() {
		return this.river.howManySource();
	}
	
	public boolean inRiverSys(Location thatLoc) {
		return this.location.equalLocation(thatLoc) || this.river.equalLocation(thatLoc);
	}
	
	public double totalMiles() {
		return this.river.totalMiles();
	}
	
	public boolean inRadius(int r, Location loc) {
		return this.river.stayAT(r, loc);
	}
	
	public double maxLen() {
		return this.river.maxLen();
	}
	
	public int confluences() {
		return this.river.confluences();
	}
	
	public ILocation locationsList() {
		return new ConsLocation(this.location,this.river.locationsList());
	}

	@Override
	public String toString() {
		return "Mouth(loc=" + this.location.toString() + ", river=" + this.river.toString() + ")";
	}
}
