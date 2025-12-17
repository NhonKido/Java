package E5_9;

public interface ILoGrade {
	public int howManyCredit();

	public double getAverage();

	public int getGradeNum();

	public ILoGrade sortByGradeDec();
	
	public ILoGrade insertByOrder(GradeRecord that);
}
