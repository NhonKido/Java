package E4_4;

public class CartPt {
    private int x;
    private int y;

    public CartPt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return this.x; }
    public int getY() { return this.y; }

    public double distanceToO() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distanceTo(CartPt that) {
        int dx = this.x - that.x;
        int dy = this.y - that.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}