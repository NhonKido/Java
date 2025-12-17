package E5_9;

public class ScoreBoard {
	//properties
	private String  name, Sclass;
	private ILoGrade listLoGrade;
	/**
	 * constructor
	 * @param name
	 * @param sclass
	 * @param listLoGrade
	 */
	public ScoreBoard(String name, String sclass, ILoGrade listLoGrade) {
		this.name = name;
		Sclass = sclass;
		this.listLoGrade = listLoGrade;
	}
	@Override
	public String toString() {
		return String.format("student: %s , class: %s , Grades: [ \n%s]",this.name, this.Sclass, this.listLoGrade);
	}
	
	public int howManyCredit() {
		return this.listLoGrade.howManyCredit();
	}
	
	public double gradeAverage() {
		return this.listLoGrade.getAverage();
	}
	
	public void sortByGradeDec() {
		this.listLoGrade = this.listLoGrade.sortByGradeDec();
	}
}
