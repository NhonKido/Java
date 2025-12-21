package E5_9;

/**
 * The ScoreBoard class represents a student's grade report, including their name, class, and a list of grade records.
 * It provides methods to calculate statistics, sort grades, and filter grades above a threshold.
 */
public class ScoreBoard {
	// Student's name
	private String  name;
	// Student's class
	private String Sclass;
	// List of grade records (ILoGrade is an interface for a list of grades)
	private ILoGrade listLoGrade;
	/**
	 * Constructs a ScoreBoard with the given student name, class, and list of grades.
	 * @param name the student's name
	 * @param sclass the student's class
	 * @param listLoGrade the list of grade records
	 */
	public ScoreBoard(String name, String sclass, ILoGrade listLoGrade) {
		this.name = name;
		Sclass = sclass;
		this.listLoGrade = listLoGrade;
	}
	/**
	 * Returns a string representation of the ScoreBoard, including student name, class, and grades.
	 */
	@Override
	public String toString() {
		return String.format("student: %s , class: %s , Grades: [ \n%s]",this.name, this.Sclass, this.listLoGrade);
	}
	/**
	 * Checks if this ScoreBoard is equal to another object.
	 * @param other the object to compare
	 * @return true if the other object is a ScoreBoard with the same name, class, and grade list
	 */
	@Override
	public boolean equals(Object other) {
		if(other == null || !(other instanceof ScoreBoard)) {
			return false;
		}
		else {
			ScoreBoard that = (ScoreBoard) other;
			return this.name == that.name && this.Sclass == that.Sclass
					&& this.listLoGrade.equals(that.listLoGrade);
		}
	}
	/**
	 * Returns the total number of credits from the grade list.
	 * @return the number of credits
	 */
	public int howManyCredit() {
		return this.listLoGrade.howManyCredit();
	}
	/**
	 * Returns the average grade from the grade list.
	 * @return the average grade
	 */
	public double gradeAverage() {
		return (this.listLoGrade.getAverage());
	}
	/**
	 * Sorts the grade list in descending order by grade.
	 */
	public void sortByGradeDec() {
		this.listLoGrade = this.listLoGrade.sortByGradeDec();
	}
	/**
	 * Returns a list of grades greater than the specified threshold, sorted in descending order.
	 * @param alt_grade the grade threshold
	 * @return a list of grades greater than alt_grade
	 */
	public ILoGrade ListGreaterThan(double alt_grade) {
		ILoGrade tempList = listLoGrade;
		return tempList.sortByGradeDec().ListGreaterThan(alt_grade);
	}
	
}