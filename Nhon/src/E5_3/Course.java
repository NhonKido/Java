package E5_3;

public class Course {
	//propertiess
	private int number, cost;
	private String title;
	/**
	 * constructor
	 * @param number
	 * @param cost
	 * @param title
	 */
	public Course(int number, int cost, String title) {
		this.number = number;
		this.cost = cost;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return String.format("code number: %s , cost: %s , title: %s", this.number, this.cost, this.title);
	}
	
}
