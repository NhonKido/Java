package E5_13;


import junit.framework.TestCase;

public class testing extends TestCase {
    

    private ABook hardcover;
    private ABook saleBook;
    private ABook paperback;
    private ABook anotherPaperback;

    /**
     * Hàm setUp() chạy TRƯỚC mỗi test method.
     */
    protected void setUp() {

        hardcover = new HardcoverBook("Java Core", "Nhon", 100.0, 2020);


        saleBook = new Sale("Old Magazine", "Other", 100.0, 1990);


        paperback = new Paperback("Light Novel", "Nhon", 60.0, 2024);
        

        anotherPaperback = new Paperback("Expensive Paper", "Other", 90.0, 2024);
    }

    /**
     * Test 1: Kiểm tra tính giá bán (salePrice)
     * Dựa trên logic đề bài: Hardcover -20%, Sale -50%, Paperback -0%
     */
    public void testSalePrice() {
        // Hardcover: 100 * 0.8 = 80.0
        assertEquals(80.0, hardcover.salePrice(), 0.001);

        // SaleBook: 100 * 0.5 = 50.0
        assertEquals(50.0, saleBook.salePrice(), 0.001);

        // Paperback: 60 * 1.0 = 60.0
        assertEquals(60.0, paperback.salePrice(), 0.001);
    }

    /**
     * Test 2: Kiểm tra so sánh giá rẻ hơn (cheaperThan)
     * Lưu ý: Phải so sánh dựa trên salePrice (giá sau khi giảm)
     */
    public void testCheaperThan() {

        assertTrue(saleBook.cheaperThan(paperback));

        assertFalse(hardcover.cheaperThan(paperback));
        

        assertTrue(paperback.cheaperThan(hardcover));
    }

    /**
     * Test 3: Kiểm tra cùng tác giả (sameAuthor)
     */
    public void testSameAuthor() {

        assertTrue(hardcover.sameAuthor(paperback));

        assertFalse(hardcover.sameAuthor(saleBook));

        assertFalse(paperback.sameAuthor(saleBook));
    }
    
    public void testExtendMethod() {
    	
    	ABook Paper = new Paperback("Light Novel", "Nhon", 60.0, 2024);
    	ABook Hard = new HardcoverBook("Ava Core", "Nhon", 100.0, 2020);
    	ABook Sale = new Sale("Old Magazine", "Other", 100.0, 1990);
    	
    	IBook Mt = new MTBook();
    	IBook s1 = new BookList(Paper, Mt);
    	IBook s2 = new BookList(Hard, s1);
    	IBook s3 = new BookList(Sale, s2);
    	
    	System.out.println(s3.toString());
    	
    	IBook nhonAU = s3.thisAUthor("Nhon");
    	
    	System.out.println("Books by Nhon:");
    	System.out.println(nhonAU.toString());
    	
    	IBook sortedBooks = s3.SortByTitle();
    	System.out.println("Sorted Books by Title:");
    	System.out.println(sortedBooks.toString());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}