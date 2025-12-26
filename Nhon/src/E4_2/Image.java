package E4_2;

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
	
}
