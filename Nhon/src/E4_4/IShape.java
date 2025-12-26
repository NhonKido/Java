package E4_4;

public interface IShape {
    public double area();
    public double distanceToO();
    public boolean contains(CartPt point);
    public Rectangle boundingBox(); // Trả về Rectangle
    public double perimeter();
}