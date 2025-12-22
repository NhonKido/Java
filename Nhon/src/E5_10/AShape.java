package E5_10;

public abstract class AShape implements IShape {
	//properties
	protected CartPT location;
	
	public abstract double area();
	public abstract double perimeter();
	public abstract double distanceTo0();
	
	@Override
	public boolean equals(Object obj) {
		if((obj==null) || !(obj instanceof AShape)) {
			return false;
		}
		else {
			AShape that = (AShape) obj;
			return this.location.equals(that.location)
					&& this.area()==that.area()
					&& this.perimeter()==that.perimeter()
					&& this.contain(that.location);
		}
	}

    @Override
    public String toString() {
        String cls = this.getClass().getSimpleName();
        return cls + "@" + this.location.toString() + "[area=" + this.area() + ",perimeter=" + this.perimeter() + "]";
    }
}