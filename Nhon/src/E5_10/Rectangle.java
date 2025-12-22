package E5_10;

public class Rectangle extends AShape{
	private int dx,dy;
	
	public Rectangle(CartPT location, int dx, int dy) {
		this.location = location;
		this.dx = dx;
		this.dy = dy;
	}

	@Override 	
	public double distanceTo0() {
		return this.location.distanceTo0();
	}

	@Override
	public double area() {
		return this.dx * this.dy;
	}

	@Override
	public Rectangle boundingBox() {
		return this;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*this.dx + 2*this.dy;
	}

	@Override
	public boolean contain(CartPT that) {
		int x = this.location.getX();
		int y = this.location.getY();
		
		return ShapeUtil.inRange(that.getX(), x - this.dx, x + this.dx)
				&& ShapeUtil.inRange(that.getY(), y - this.dy, y + this.dy);
	}

}
