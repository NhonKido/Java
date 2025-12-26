package E4_5;

public class Sound extends Record{
	//properties
	private int playingTime;

	/**
	 * @param playingTime
	 */
	public Sound(String source, long sizeB, int playingTime) {
		this.source = source;
		this.sizeB = sizeB;
		this.playingTime = playingTime;
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
