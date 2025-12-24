package E5_14;

public interface IRiver {
	public int howManySource();

	public boolean equalLocation(Location thatLoc);

	public double totalMiles();

	public boolean stayAT(int r, Location loc);

	public double maxLen();

	public int confluences();

	public ILocation locationsList();
}
