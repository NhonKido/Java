package E4_5;

public interface IRecord {
	/**
	 * internet speed = byte / s
	 * @param Internet_speed
	 * @return
	 */
	public int timeToDownload(int Internet_speed);
	public boolean smallerThan(long MaxSize);
	public boolean sameName(String Name);
}
