package E5_10;

public class CompositeShape implements IShape {
	
	IShape top;
	IShape bot;
	
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

}	
