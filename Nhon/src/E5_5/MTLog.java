package E5_5;

public class MTLog implements ILog {
	//total distance
	public double total_in_sameMonth_year(int mon, int year) {
		return 0;
	}
	@Override
	public double maxDis() {return -1;}

	@Override
	public ILog insByDistanceOrder(Entry e) {
		return new ConsLog(e,new MTLog());
	}
	@Override
	public ILog sortBySpeedDES() {
		return new MTLog();
	}
	@Override
	public String toString() {
		return "";
	}
	

}
