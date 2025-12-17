package E5_9;

public class GradeRecord {
	//properties
	private double grade;
	private Course course;
	//constructor
	public GradeRecord(double grade, Course course) {
		this.grade = grade;
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "grade: " + String.valueOf(grade) + " {" + this.course.toString() + "}\n";
	}
	
	public int getCredit() {
		return this.course.getCredit();
	}

	public double getTotal() {
		return this.getGrade() * this.getCredit();
	}
	
	public double getGrade() {
		return this.grade;
	}
}
