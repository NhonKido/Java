package E5_10;

public abstract class AShape implements IShape {
	//properties
	protected CartPT location;
	
	public abstract double area();
	//public abstract boolean contains(CartPT point);
	public abstract Rectangle boundingBox();
	public abstract double perimeter();
}
