package E4_4;

public class Square extends AShape {
    private int size;

    public Square(CartPt loc, int size) {
        super(loc);
        this.size = size;
    }

    @Override
    public double area() {
        return this.size * this.size;
    }

    @Override
    public boolean contains(CartPt point) {
        int x = this.location.getX();
        int y = this.location.getY();
        return ShapeUtils.between(point.getX(), x, x + this.size) &&
               ShapeUtils.between(point.getY(), y, y + this.size);
    }

    @Override
    public Rectangle boundingBox() {
        // Square cũng trả về Rectangle
        return new Rectangle(this.location, this.size, this.size);
    }

    @Override
    public double perimeter() {
        return this.size * 4;
    }
}