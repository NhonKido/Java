package E5_9;

public class MTLoGrade implements ILoGrade {
	@Override
	public String toString() {return "";}

	@Override
	public int howManyCredit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAverage() {
		return 0;
	}

	@Override
	public int getGradeNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ILoGrade sortByGradeDec() {
		return new MTLoGrade();
	}

	@Override
	public ILoGrade insertByOrder(GradeRecord that) {
		return new ConsLoGrade(that, new MTLoGrade());
	}
}
