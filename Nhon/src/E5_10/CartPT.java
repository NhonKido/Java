package E5_10;

public class CartPT {
	private int x,y;
	
	public CartPT(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public double distanceTo0() {
		return Math.sqrt(x*x + y*y);
	}
	
	public double distanceTo(CartPT p) {
		int dx = x - p.getX();
		int dy = y - p.getY();
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

    @Override
    public boolean equals(Object obj) {
    	if((obj==null) || !(obj instanceof CartPT)) {
			return false;
		}
		else {
			CartPT that = (CartPT) obj;
			return this.x == that.x && this.y == that.y;
		}
    }
}