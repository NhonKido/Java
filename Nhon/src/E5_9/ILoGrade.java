package E5_9;

/**
 * ILoGrade is an interface for a list of GradeRecord objects.
 * It defines methods for list operations such as calculating totals, averages, sorting, and filtering by grade.
 */
public interface ILoGrade {
	/**
	 * Returns the total number of credits in the list.
	 * @return the sum of credits
	 */
	public int howManyCredit();
	/**
	 * Returns the average grade for all GradeRecords in the list.
	 * @return the average grade
	 */
	public double getAverage();
	/**
	 * Returns the total weighted grade for all GradeRecords in the list.
	 * @return the total weighted grade
	 */
	public double getTotal();
	/**
	 * Returns the number of GradeRecords in the list.
	 * @return the number of GradeRecords
	 */
	public int getGradeNum();
	/**
	 * Returns a new list sorted in descending order by grade.
	 * @return a sorted ILoGrade list
	 */
	public ILoGrade sortByGradeDec();
	/**
	 * Inserts a GradeRecord into the list in descending order by grade.
	 * @param that the GradeRecord to insert
	 * @return a new ILoGrade list with the GradeRecord inserted
	 */
	public ILoGrade insertByOrder(GradeRecord that);
	/**
	 * Returns a list of GradeRecords with grades greater than the specified threshold.
	 * @param alt_grade the grade threshold
	 * @return a new ILoGrade list with grades greater than alt_grade
	 */
	public ILoGrade ListGreaterThan(double alt_grade);
}