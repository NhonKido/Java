package E5_9;

public interface ILoGrade {
	public int howManyCredit();

	public double getAverage();
	public double getTotal();

	public int getGradeNum();

	public ILoGrade sortByGradeDec();
	
	public ILoGrade insertByOrder(GradeRecord that);

	public ILoGrade ListGreaterThan(double alt_grade);
	
}
