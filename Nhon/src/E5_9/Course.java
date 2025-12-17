package E5_9;

public class Course {
	//properties
	private int number, credit;
	private String title;
	/**
	 * constructor
	 * @param number
	 * @param credit
	 * @param title
	 */
	public Course(int number, int credit, String title) {
		this.number = number;
		this.credit = credit;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return String.format("code number: %s , credit: %s , title: %s", this.number, this.credit, this.title);
	}

	public int getCredit() {
		return this.credit;
	}
	
}
