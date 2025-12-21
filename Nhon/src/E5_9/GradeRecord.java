package E5_9;

/**
 * GradeRecord represents a student's grade for a specific course.
 * It stores the grade value and the associated Course object, and provides methods for grade and credit calculations.
 */
public class GradeRecord {
	// The grade value for the course
	private double grade;
	// The associated Course object
	private Course course;
	/**
	 * Constructs a GradeRecord with the specified grade and course.
	 * @param grade the grade value
	 * @param course the associated Course object
	 */
	public GradeRecord(double grade, Course course) {
		this.grade = grade;
		this.course = course;
	}
	/**
	 * Returns a string representation of the GradeRecord, including grade and course details.
	 */
	@Override
	public String toString() {
		return "grade: " + String.valueOf(grade) + " {" + this.course.toString() + "}\n";
	}
	/**
	 * Checks if this GradeRecord is equal to another object.
	 * @param other the object to compare
	 * @return true if the other object is a GradeRecord with the same grade and course
	 */
	@Override
	public boolean equals(Object other) {
		if(other == null || !(other instanceof GradeRecord)) {
			return false;
		}
		GradeRecord that = (GradeRecord) other;
		return this.grade == that.grade && this.course.equals(that.course);
	}
	/**
	 * Returns the number of credits for the associated course.
	 * @return the credit value
	 */
	public int getCredit() {
		return this.course.getCredit();
	}
	/**
	 * Returns the total weighted grade (grade * credit) for this record.
	 * @return the total weighted grade
	 */
	public double getTotal() {
		return this.getGrade() * this.getCredit();
	}
	/**
	 * Returns the grade value for this record.
	 * @return the grade value
	 */
	public double getGrade() {
		return this.grade;
	}
}