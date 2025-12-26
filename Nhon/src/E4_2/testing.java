package E4_2;

import junit.framework.TestCase;

public class testing extends TestCase {
	
	IRecord anh;
	IRecord nhac;
	IRecord sach;
	
	//test constructor
	public void testALLconstructor() {
		anh = new Image("E\\windows\\Image\\anhcontro.gif",7777L, 460,390, "low");
		nhac = new Sound("E\\windows\\mp3\\nhac.mp3",22842948294829L,600);
		sach = new Text("E\\windows\\text\\luong.txt",22424L,5);
	}

}
