package E4_4;

public class Dot extends AShape {
    
    public Dot(CartPt loc) {
        super(loc);
    }

    @Override
    public double area() { return 0.0; }

    @Override
    public boolean contains(CartPt point) {
        return this.location.distanceTo(point) == 0.0;
    }

    @Override
    public Rectangle boundingBox() {
        // Trả về Rectangle kích thước 0x0
        return new Rectangle(this.location, 0, 0);
    }

    @Override
    public double perimeter() { return 0.0; }
}