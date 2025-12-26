package E4_2;

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
	
}
