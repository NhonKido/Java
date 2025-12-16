package E5_5;

public class Entry {
	//properties
	private Date date;
	private double distance;
	private int duration;
	private String comment;
	/**
	 * constructor
	 * @param date
	 * @param distance
	 * @param duration
	 * @param comment
	 */
	public Entry(Date date, double distance,	int duration, String comment) {
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}
	//total distance
	public double total_in_sameMonth_year(int mon,int year) {
		if(this.date.sameYandM(mon, year)) {return this.distance;}
		return 0;
	}
	/**
	 * 
	 * @return only return distance in this entry
	 */
	public double getDis() {return this.distance;}
	//return speed
	public double speed() {
		return this.distance / this.duration;
	}
	public boolean Faster(Entry e) {
		return this.speed() >= e.speed();
	}
	@Override
	public String toString() {
		return String.format("%s : speed:%s ; distance: %s ; duration: %s minunte.",
				this.date.getDate(),this.speed(),this.distance,this.duration );
	}
}
