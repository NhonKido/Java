package E5_14;

public class Confluence extends ARiver{
	
	private IRiver left, right;
	
	public Confluence(Location location, double len, IRiver left, IRiver right) {
		this.location = location;
		this.len = len;
		this.left = left;
		this.right = right;
	}

	@Override
	public int howManySource() {
		return this.left.howManySource()+this.right.howManySource();
	}
	
	@Override
	public boolean equalLocation(Location thatLoc) {
		return this.location.equalLocation(thatLoc) 
				|| this.left.equalLocation(thatLoc) 
				|| this.right.equalLocation(thatLoc);
	}

	@Override
	public double totalMiles() {
		return this.len + this.left.totalMiles() + this.right.totalMiles();
	}

	@Override
	public boolean stayAT(int r, Location loc) {
		return this.location.inRange(r, loc) 
				|| this.left.stayAT(r, loc) 
				|| this.right.stayAT(r, loc);
	}

	@Override
	public double maxLen() {
		return Math.max(this.len,Math.max(this.left.maxLen(),this.right.maxLen()));
	}

	@Override
	public int confluences() {
		return 1+ this.left.confluences() + this.right.confluences();
	}

	@Override
	public ILocation locationsList() {
		
		ILocation first = this.left.locationsList();
		ILocation rest = this.right.locationsList();
		ILocation mid;
		
		if(first instanceof Location) {
			Location that = (Location) first;
			mid = new ConsLocation(that, rest);
		}
		else {
			Location that = (Location) rest;
			mid = new ConsLocation(that, first);
		}
		
		return new ConsLocation(this.location, mid);
	}
	
	@Override
	public String toString() {
		return "Confluence(len=" + this.len + ", loc=" + this.location.toString() + 
				", left=" + this.left.toString() + ", right=" + this.right.toString() + ")";
	}

}