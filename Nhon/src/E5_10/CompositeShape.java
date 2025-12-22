package E5_10;

public class CompositeShape implements IShape {
	
	IShape top;
	IShape bot;
	public static int maxX,maxY,minX,minY;
	
	public CompositeShape(IShape top, IShape bot) {
		this.top = top;
		this.bot = bot;
	}
	
	//empty shape
	public CompositeShape() {};
	
	@Override
	public double distanceTo0() {
		return Math.min(top.distanceTo0(), bot.distanceTo0());
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj==null) || !(obj instanceof CompositeShape)) {
			return false;
		}
		else {
			CompositeShape that = (CompositeShape) obj;
			return this.top.equals(that.top)
					&& this.bot.equals(that.bot);
		}
	}

	@Override
    public Rectangle boundingBox() {
        Rectangle r1 = this.top.boundingBox();
        Rectangle r2 = this.bot.boundingBox();

        // find top left key points (Min)
        int MinX = Math.min(r1.location.getX(), r2.location.getX());
        //---------------------------------
        int MinY = Math.min(r1.location.getY(), r2.location.getY());

        // find bottom right key points (Max)
        int r1MaxX = r1.location.getX() + r1.getWid();
        int r2MaxX = r2.location.getX() + r2.getWid();
        int MaxX = Math.max(r1MaxX, r2MaxX);
        //---------------------------------
        int r1MaxY = r1.location.getY() + r1.getHei();
        int r2MaxY = r2.location.getY() + r2.getHei();
        int MaxY = Math.max(r1MaxY, r2MaxY);

        return new Rectangle(
                new CartPT(MinX, MinY),
                MaxX - MinX,
                MaxY - MinY
        );
    }

	@Override
	public boolean contain(CartPT that) {
		return this.top.contain(that) 
				|| this.bot.contain(that);
	}

    @Override
    public String toString() {
        return "Compos( " + top.toString() + ", " + bot.toString() + ")";
    }

}	