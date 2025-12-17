package E5_9;

import junit.framework.TestCase;

public class testing extends TestCase {

	public void testConstructor() {
		ILoGrade empty,all;
		Course course1,course2;
		GradeRecord record1, record2;
		ScoreBoard nhon;
		
		course1 = new Course(12, 19292, "dao lua");
		record1 = new GradeRecord(91.1, course1);
		course2 = new Course(43, 8832,"ban quat");
		record2 = new GradeRecord(84.9, course2);
		empty = new MTLoGrade();
	 	all = new ConsLoGrade(record1,new ConsLoGrade(record2, empty));
		
		nhon = new ScoreBoard("Nhon Dang", "dh25dtc",all);
		System.out.println(nhon.toString());
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		ILoGrade empty,all;
		Course course1,course2;
		GradeRecord record1, record2;
		ScoreBoard nhon;
		
		course1 = new Course(12, 19292, "dao lua");
		record1 = new GradeRecord(91.1, course1);
		course2 = new Course(43, 8832,"ban quat");
		record2 = new GradeRecord(84.9, course2);
		empty = new MTLoGrade();
	 	all = new ConsLoGrade(record1,new ConsLoGrade(record2, empty));
	 	
	 	
	}

}
