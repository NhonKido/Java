package E5_14;

public class Source extends ARiver{

	public Source(Location location, double len) {
		this.location = location;
		this.len = len;
	}

	@Override
	public int howManySource() {
		return 1;
	}

	@Override
	public boolean equalLocation(Location thatLoc) {
		return this.location.equalLocation(thatLoc);
	}

	@Override
	public double totalMiles() {
		return this.len;
	}

	@Override
	public boolean stayAT(int r, Location loc) {
		return this.location.inRange(r, loc);
	}

	@Override
	public double maxLen() {
		return this.len;
	}

	@Override
	public int confluences() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ILocation locationsList() {
		return this.location;
	}
	
	@Override
	public String toString() {
		return "Source(len=" + this.len + ", loc=" + this.location.toString() + ")";
	}
	
	
}