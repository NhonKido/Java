package E5_14;

public class Location implements ILocation{
	public int x,y;
	private String name;

	public Location(int x, int y, String name) {
		super();
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	
	
	public boolean equalLocation(Location thatLoc) {
		return this.x == thatLoc.x && this.y == thatLoc.y;
	}

	public boolean inRange(int r, Location loc) {
		int dx = loc.x-this.x;
		int dy = loc.y-this.y;
		double distance = Math.sqrt(dx*dx + dy*dy);
		return distance <= r;
	}
	
	@Override
	public String toString() {
		return "Location(" + this.name + ", x=" + this.x + ", y=" + this.y + ")\n";
	}
	
}