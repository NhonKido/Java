package E4_4;

public class Rectangle extends AShape {
    private int width;
    private int height;

    public Rectangle(CartPt loc, int width, int height) {
        super(loc);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public boolean contains(CartPt point) {
        // Dùng ShapeUtils cho gọn code
        int x = this.location.getX();
        int y = this.location.getY();
        return ShapeUtils.between(point.getX(), x, x + this.width) &&
               ShapeUtils.between(point.getY(), y, y + this.height);
    }

    @Override
    public Rectangle boundingBox() {
        // Trả về chính nó
        return new Rectangle(this.location, this.width, this.height);
    }

    @Override
    public double perimeter() {
        return (this.width + this.height) * 2;
    }
}