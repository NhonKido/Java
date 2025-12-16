package E5_3;

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
	
}
