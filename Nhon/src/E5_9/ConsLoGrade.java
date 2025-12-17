package E5_9;

public class ConsLoGrade implements ILoGrade{
	//properties
	private GradeRecord first;
	private ILoGrade rest;
	//constructor
	public ConsLoGrade(GradeRecord first, ILoGrade rest) {
		this.first = first;
		this.rest = rest;
	}
	
	@Override
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}

	@Override
	public int howManyCredit() {
		return this.first.getCredit() + this.rest.howManyCredit();
	}

	@Override
	public double getAverage() {
		int manyGrade = this.getGradeNum();
		double total =  this.first.getTotal() + this.rest.getAverage();
		return total / manyGrade;
	}

	@Override
	public int getGradeNum() {
		return 1 + this.rest.getGradeNum();
	}

	@Override
	public ILoGrade sortByGradeDec() {
		return this.rest.insertByOrder(this.first);
	}

	@Override
	public ILoGrade insertByOrder(GradeRecord that) {
		if(this.first.getGrade() > that.getGrade()) {
			return new ConsLoGrade(this.first, this.rest.insertByOrder(that));
		}
		return new ConsLoGrade(that, this.sortByGradeDec());
	}
	
}
