package E5_9;

/**
 * ConsLoGrade represents a non-empty list of GradeRecord objects.
 * It implements the ILoGrade interface and provides methods for list operations
 * such as calculating totals, averages, sorting, and filtering by grade.
 */
public class ConsLoGrade implements ILoGrade{
	// The first GradeRecord in the list
	private GradeRecord first;
	// The rest of the list (recursive reference)
	private ILoGrade rest;
	/**
	 * Constructs a ConsLoGrade with the given first GradeRecord and the rest of the list.
	 * @param first the first GradeRecord
	 * @param rest the rest of the list (ILoGrade)
	 */
	public ConsLoGrade(GradeRecord first, ILoGrade rest) {
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Returns a string representation of the list by concatenating the string representations of all GradeRecords.
	 */
	@Override
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}
	/**
	 * Checks if this ConsLoGrade is equal to another object.
	 * @param other the object to compare
	 * @return true if the other object is a ConsLoGrade with the same first and rest
	 */
	@Override
	public boolean equals(Object other) {
		if(other == null || !(other instanceof ConsLoGrade)) {
			return false;
		}
		else {
			ConsLoGrade that = (ConsLoGrade) other;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
	/**
	 * Returns the total number of credits in the list.
	 * @return the sum of credits
	 */
	@Override
	public int howManyCredit() {
		return this.first.getCredit() + this.rest.howManyCredit();
	}
	/**
	 * Returns the average grade for all GradeRecords in the list.
	 * @return the average grade
	 */
	@Override
	public double getAverage() {
		int manyGrade = this.getGradeNum();
		double total =  this.getTotal();
		return total / manyGrade;
	}
	/**
	 * Returns the total weighted grade for all GradeRecords in the list.
	 * @return the total weighted grade
	 */
	@Override
	public double getTotal() {
		return this.first.getTotal() + this.rest.getTotal();
	}
	/**
	 * Returns the number of GradeRecords in the list.
	 * @return the number of GradeRecords
	 */
	@Override
	public int getGradeNum() {
		return 1 + this.rest.getGradeNum();
	}
	/**
	 * Returns a new list sorted in descending order by grade.
	 * @return a sorted ILoGrade list
	 */
	@Override
	public ILoGrade sortByGradeDec() {
		return this.rest.sortByGradeDec().insertByOrder(this.first);
	}
	/**
	 * Inserts a GradeRecord into the list in descending order by grade.
	 * @param that the GradeRecord to insert
	 * @return a new ILoGrade list with the GradeRecord inserted
	 */
	@Override
	public ILoGrade insertByOrder(GradeRecord that) {
		if(this.first.getGrade() > that.getGrade()) {
			return new ConsLoGrade(this.first, this.rest.insertByOrder(that));
		}
		return new ConsLoGrade(that, this);
	}
	/**
	 * Returns a list of GradeRecords with grades greater than the specified threshold.
	 * @param alt_grade the grade threshold
	 * @return a new ILoGrade list with grades greater than alt_grade
	 */
	@Override
	public ILoGrade ListGreaterThan(double alt_grade) {
		if(this.first.getGrade() > alt_grade) {
			return new ConsLoGrade(this.first, this.rest.ListGreaterThan(alt_grade));
		}else { 
			return new MTLoGrade();
		}
	}
}