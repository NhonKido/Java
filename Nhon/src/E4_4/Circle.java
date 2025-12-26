package E4_4;

public class Circle extends AShape {
    private int radius;

    public Circle(CartPt loc, int radius) {
        super(loc);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public boolean contains(CartPt point) {
        return this.location.distanceTo(point) <= this.radius;
    }

    @Override
    public Rectangle boundingBox() {
        // Tạo Rectangle bao ngoại tiếp hình tròn
        int r = this.radius;
        int x = this.location.getX() - r;
        int y = this.location.getY() - r;
        
        return new Rectangle(new CartPt(x, y), 2 * r, 2 * r);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}