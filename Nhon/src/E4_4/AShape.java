package E4_4;

public abstract class AShape implements IShape {
    protected CartPt location;

    public AShape(CartPt loc) {
        this.location = loc;
    }

    @Override
    public double distanceToO() {
        return this.location.distanceToO();
    }

    // Các hàm khác để abstract cho con tự xử lý
    public abstract double area();
    public abstract boolean contains(CartPt point);
    public abstract Rectangle boundingBox();
    public abstract double perimeter();
}