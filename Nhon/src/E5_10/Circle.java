package E5_10;

public class Circle extends AShape{
	private int r;
	
	public Circle(CartPT location,int r) {
		this.location = location;
		this.r = r;
	}

	@Override
	public double distanceTo0() {
		return this.location.distanceTo0();
	}

	@Override
	public double area() {
		return Math.PI*r*r;
	}

	@Override
	public Rectangle boundingBox() {
		return new Rectangle(new CartPT(this.location.getX()-r,this.location.getY()-r), 2*r, 2*r);
	}

	@Override
	public double perimeter() {
		return 2*Math.PI*r;
	}

	@Override
	public boolean contain(CartPT that) {
		return this.location.distanceTo(that) <= this.r;
	}

    @Override
    public String toString() {
        return "Circle@" + this.location.toString() + "(r=" + this.r + ")";
    }


    
}