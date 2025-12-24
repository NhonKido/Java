package E5_14;

public class Confluence extends ARiver{
	
	private ARiver left, right;
	
	public Confluence(Location location, double len, ARiver left, ARiver right) {
		this.location = location;
		this.len = len;
		this.left = left;
		this.right = right;
	}
}
