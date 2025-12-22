package E5_2;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testBookList() {
		Book selfHelp, turtorial, all, empty;
		selfHelp = new Book("Nhon Dang", "cach kinh doanh 1 von 4 loi", 2025, 991939.31);
		turtorial = new Book("Zurkerber", "how to hack ex's facebook", 2025, 9393.9);
		empty = new Book();
		all = new Book(selfHelp,new Book(turtorial,empty));
		System.out.println(all.toString());
	}
	

}
