package E5_10;

public class Dot extends AShape {
	
	public Dot(CartPT location) {
		this.location = location;
	}

	@Override
	public double distanceTo0() {
		return location.distanceTo0();
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public Rectangle boundingBox() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return -1;
	}


}
