package E4_5;

public class Image extends Record{
	//properties
	private int height,weight;
	private String quality;
	/**
	 * this is the constructor
	 * @param height
	 * @param weight
	 * @param quality
	 */
	public Image(String source, long sizeB,int height, int weight, String quality) {
		this.source = source;
		this.sizeB = sizeB;	
		this.height = height;
		this.weight = weight;
		this.quality = quality;
	}
	@Override
	public int timeToDownload(int Internet_speed) {
		return (int)(this.sizeB / Internet_speed); //return second
	}
	@Override
	public boolean smallerThan(long MaxSize) {return this.sizeB < MaxSize;}
	
	/**
	 * how can i even create this method when there no name property:(((
	 */
	@Override
	public boolean sameName(String Name) {
		return this.source == Name; 
	}
	
}
