package E5_10;

public class Rectangle extends AShape{
	private int height,weight;
	
	public Rectangle(CartPT location, int height, int weight) {
		this.location = location;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public double distanceTo0() {
		return this.location.distanceTo0();
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Rectangle boundingBox() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
