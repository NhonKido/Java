package E4_5;

import junit.framework.TestCase;

public class testing extends TestCase {
	
	IRecord pic;
	IRecord nhac;
	IRecord sach;
	
	//test constructor
	public void testALLconstructor() {
		pic = new Image("E\\windows\\Image\\anhcontro.gif",7777L, 460,390, "low");
		nhac = new Sound("E\\windows\\mp3\\nhac.mp3",22842948294829L,600);
		sach = new Text("E\\windows\\text\\luong.txt",22424L,5);
	}
	
	
	/**
	 * dùng setup để gán dữ liệu cho các biến trên, để nhìn test dễ hơn + lười
	 * junit sẽ không lưu các giá trị gán của biến nên phải dùng setup để ghi đè
	 */
	@Override
    protected void setUp() throws Exception {
        super.setUp();
		pic = new Image("E\\windows\\Image\\anhcontro.gif",7777L, 460,390, "low");
		nhac = new Sound("E\\windows\\mp3\\nhac.mp3",228L,600);
		sach = new Text("E\\windows\\text\\luong.txt",22424L,5);        
	}
	
	/**
	 * test everthing related to these subclass
	 */
	public void testSubClass() {
		
		//em lười tạo test quá:((( em xin lỗi thầyy
		
		assertEquals(77,pic.timeToDownload(100));
		assertTrue(nhac.smallerThan(2000L));
		assertFalse(sach.sameName("E\\windows\\Image\\anhcontro.gif"));
		
	}

}
