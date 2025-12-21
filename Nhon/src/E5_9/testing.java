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

	}
	
	public void testmethod() {
		//properties
		ILoGrade empty,all;
		Course course1,course2, course3;
		GradeRecord record1, record2, record3;
		ScoreBoard nhon;
		
		//init
		course1 = new Course(12, 15, "dao lua");
		course2 = new Course(43, 20,"ban quat");
		course3 = new Course(26,12,"xao tro");
		record1 = new GradeRecord(90.0, course1);
		record2 = new GradeRecord(80.0, course2);
		record3 = new GradeRecord(100, course3);
		empty = new MTLoGrade();
	 	all = new ConsLoGrade(record2,new ConsLoGrade(record1, new ConsLoGrade(record3, empty)));
		nhon = new ScoreBoard("Nhon Dang", "dh25dtc",all);
		//run
		System.out.println(nhon.toString());
		nhon.sortByGradeDec();
		
		//before sort //run
		System.out.println(nhon.toString());
		
		// restart nhon
		nhon = new ScoreBoard("Nhon Dang", "dh25dtc",all);
		
		//15 + 20 + 12
		assertEquals(47, nhon.howManyCredit());
		
		//(90*15 + 80*20 + 100*12) / 47 = 1383.3
		assertEquals(1383.3, nhon.gradeAverage(),0.1);
		
		//test create list greater than 80
		System.out.println("Grades greater than 80:");
		System.out.println(nhon.ListGreaterThan(80).toString());
		
		//test equals
		ScoreBoard nhon2 = new ScoreBoard("Nhon Dang", "dh25dtc",all);
		assertTrue(nhon.equals(nhon2));
		
	 	
	}
	

}
