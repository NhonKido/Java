package E5_5;

public class Date {
	//properties
	private int day,month,year;
	
	/**
	 * constructor
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean sameYandM(int mon, int year) {
		return this.month == mon && this.year == year; 
	}

	public String getDate() {
		return String.format("%s/%s/%s", this.day, this.month, this.year);
	}
}
