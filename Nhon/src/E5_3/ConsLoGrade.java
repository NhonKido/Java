package E5_3;

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
	
}
