package E5_9;

/**
 * The Course class represents a course with a code number, credit value, and title.
 * It provides methods for string representation, equality checking, and retrieving the credit value.
 */
public class Course {
	// Course code number
	private int number;
	// Number of credits for the course
	private int credit;
	// Title of the course
	private String title;
	/**
	 * Constructs a Course with the specified code number, credit, and title.
	 * @param number the course code number
	 * @param credit the number of credits
	 * @param title the course title
	 */
	public Course(int number, int credit, String title) {
		this.number = number;
		this.credit = credit;
		this.title = title;
	}
	/**
	 * Returns a string representation of the Course.
	 * @return a string with course number, credit, and title
	 */
	@Override
	public String toString() {
		return String.format("code number: %s , credit: %s , title: %s", this.number, this.credit, this.title);
	}
	/**
	 * Checks if this Course is equal to another object.
	 * @param other the object to compare
	 * @return true if the other object is a Course with the same number, credit, and title
	 */
	@Override
	public boolean equals(Object other) {
		if(other == null || !(other instanceof Course)) {return false;}
		Course that = (Course) other;
		return this.number == that.number && this.credit == that.credit && this.title == that.title;
	}
	/**
	 * Returns the number of credits for this course.
	 * @return the credit value
	 */
	public int getCredit() {
		return this.credit;
	}
}