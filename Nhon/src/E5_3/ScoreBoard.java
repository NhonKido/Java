package E5_3;

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
}
