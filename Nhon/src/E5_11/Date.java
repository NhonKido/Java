package E5_11;

public class Date {
	private int day, month, year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean Older(Date that) {
		if(this.year < that.year) {return true;}
		if(this.month < that.month) {return true;}
		if(this.day <= that.day) {return true;}
		return false;
	}

}
