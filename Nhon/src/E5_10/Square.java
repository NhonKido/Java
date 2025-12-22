package E5_10;

public class Square extends AShape{
	private int size;
	
	public Square(CartPT location, int size) {
		this.location = location;
		this.size = size;
	}

	@Override
	public double distanceTo0() {
		return this.location.distanceTo0();
	}

	@Override
	public double area() {
		return size*size;
	}

	@Override
	public Rectangle boundingBox() {
		return new Rectangle(this.location, this.size, this.size);
	}

	@Override
	public double perimeter() {
		return this.size*4;
	}
	
	
}
