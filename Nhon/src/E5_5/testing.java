package E5_5;

import junit.framework.TestCase;

public class testing extends TestCase {
	private Date d1, d2, d3, d4;
    private Entry e1, e2, e3, e4;
    private ILog emptyLog, log1, log2, log3, log4;


    public void testConstructor() {
	    	// Tạo ngày tháng
	    	d1 = new Date(5, 5, 2005);
	    	d2 = new Date(6, 6, 2005);
	    	d3 = new Date(23, 6, 2005);
	    	d4 = new Date(1, 1, 2024);
	    	
	
	    	e1 = new Entry(d1, 5.0, 25, "Good");    // 5 miles
	    	e2 = new Entry(d2, 3.0, 24, "Tired");   // 3 miles
	    	e3 = new Entry(d3, 36.0, 156, "Great"); // 26 miles
	    	e4 = new Entry(d4, 10.0, 60, "New Year"); // 10 miles
	    	
	    	emptyLog = new MTLog();
	    	log1 = new ConsLog(e1,emptyLog);
	    	log2 = new ConsLog(e2, log1);
	    	log3 = new ConsLog(e3, log2);
	    	log4 = new ConsLog(e4, log3);
    }
    	
    	
     //Hàm setUp() chạy TRƯỚC mỗi test method.
    public void setUp() {
        // Tạo ngày tháng
        d1 = new Date(5, 5, 2005);
        d2 = new Date(6, 6, 2005);
        d3 = new Date(7, 6, 2005); // Cùng tháng 6 với d2
        d4 = new Date(1, 1, 2024);

        // Tạo các Entry (Nhật ký chạy)
        // Entry(Date, distance, duration, comment)
        e1 = new Entry(d1, 5.0, 25, "Good");    // 5 miles
        e2 = new Entry(d2, 3.0, 24, "Tired");   // 3 miles
        e3 = new Entry(d3, 26.0, 156, "Great"); // 26 miles
        e4 = new Entry(d4, 10.0, 60, "New Year"); // 10 miles
        
        //tao list
        emptyLog = new MTLog();
        log1 = new ConsLog(e1,emptyLog);
        log2 = new ConsLog(e2, log1);
        log3 = new ConsLog(e3, log2);
        log4 = new ConsLog(e4, log3);        
    }
    
    public void testMethod() {
    		System.out.println(log4.maxDis()); //26
    		System.out.println(log4.total_in_sameMonth_year(6, 2005));// 26+3
    		//before sort
    		System.out.println(log4.toString());
    		//after sort
    		log4 = log4.sortBySpeedDES();
    		System.out.println(log4.toString());
    		
    }
}
