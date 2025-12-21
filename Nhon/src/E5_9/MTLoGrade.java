package E5_9;

/**
 * MTLoGrade represents an empty list of GradeRecord objects.
 * It implements the ILoGrade interface and provides base cases for all list operations.
 */
public class MTLoGrade implements ILoGrade {
	/**
	 * Returns an empty string representation for the empty list.
	 */
	@Override
	public String toString() {return "";}

	/**
	 * Checks if this MTLoGrade is equal to another object.
	 * @param other the object to compare
	 * @return true if the other object is also an MTLoGrade
	 */
	@Override
	public boolean equals(Object other) {
		if(other == null || !(other instanceof MTLoGrade)) {
			return false;
		}
		MTLoGrade that = (MTLoGrade) other;
		return this==(that);
	}
	/**
	 * Returns 0 as the number of credits in the empty list.
	 */
	@Override
	public int howManyCredit() {
		return 0;
	}
	/**
	 * Returns 0 as the average grade for the empty list.
	 */
	@Override
	public double getAverage() {
		return 0;
	}
	/**
	 * Returns 0 as the number of GradeRecords in the empty list.
	 */
	@Override
	public int getGradeNum() {
		return 0;
	}
	/**
	 * Returns a new empty list when sorting an empty list.
	 */
	@Override
	public ILoGrade sortByGradeDec() {
		return new MTLoGrade();
	}
	/**
	 * Inserts a GradeRecord into the empty list, resulting in a single-element list.
	 * @param that the GradeRecord to insert
	 * @return a new ConsLoGrade containing the GradeRecord
	 */
	@Override
	public ILoGrade insertByOrder(GradeRecord that) {
		return new ConsLoGrade(that, new MTLoGrade());
	}
	/**
	 * Returns 0 as the total weighted grade for the empty list.
	 */
	@Override
	public double getTotal() {
		return 0;
	}
	/**
	 * Returns a new empty list when filtering an empty list by grade.
	 * @param alt_grade the grade threshold
	 * @return a new MTLoGrade (empty list)
	 */
	@Override
	public ILoGrade ListGreaterThan(double alt_grade) {
		return new MTLoGrade();
	}
}