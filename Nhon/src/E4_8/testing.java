package E4_8;


import junit.framework.TestCase;

public class testing extends TestCase {
    
    // Khai báo các biến dùng chung (Fixtures)
    // Mình dùng kiểu dữ liệu là ABook (Abstract class) để thể hiện tính đa hình
    private ABook hardcover;
    private ABook saleBook;
    private ABook paperback;
    private ABook anotherPaperback;

    /**
     * Hàm setUp() chạy TRƯỚC mỗi test method.
     */
    protected void setUp() {
        // 1. Hardcover: Giá gốc 100.0. Giảm 20% -> Giá bán mong đợi: 80.0
        // Tác giả: "Nhon"
        hardcover = new HardcoverBook("Java Core", "Nhon", 100.0, 2020);

        // 2. SaleBook: Giá gốc 100.0. Giảm 50% -> Giá bán mong đợi: 50.0
        // Tác giả: "Other" (Khác Nhon)
        saleBook = new Sale("Old Magazine", "Other", 100.0, 1990);

        // 3. Paperback: Giá gốc 60.0. Không giảm -> Giá bán mong đợi: 60.0
        // Tác giả: "Nhon" (Cùng tác giả với Hardcover)
        paperback = new Paperback("Light Novel", "Nhon", 60.0, 2024);
        
        // 4. Một cuốn Paperback khác để test so sánh giá
        // Giá gốc 90.0 -> Giá bán mong đợi: 90.0
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
        // So sánh SaleBook (Giá bán 50) với Paperback (Giá bán 60)
        // 50 < 60 -> True
        assertTrue(saleBook.cheaperThan(paperback));
        
        // So sánh Hardcover (Giá bán 80) với Paperback (Giá bán 60)
        // 80 < 60 -> False
        assertFalse(hardcover.cheaperThan(paperback));
        
        // So sánh Paperback (60) với Hardcover (80)
        // 60 < 80 -> True
        assertTrue(paperback.cheaperThan(hardcover));
    }

    /**
     * Test 3: Kiểm tra cùng tác giả (sameAuthor)
     */
    public void testSameAuthor() {
        // Hardcover ("Nhon") vs Paperback ("Nhon") -> True
        assertTrue(hardcover.sameAuthor(paperback));

        // Hardcover ("Nhon") vs SaleBook ("Other") -> False
        assertFalse(hardcover.sameAuthor(saleBook));
        
        // Paperback ("Nhon") vs SaleBook ("Other") -> False
        assertFalse(paperback.sameAuthor(saleBook));
    }
}