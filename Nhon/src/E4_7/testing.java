package E4_7;

import junit.framework.TestCase;

public class testing extends TestCase {


    private ITaxiVehicle cab;
    private ITaxiVehicle limo;
    private ITaxiVehicle van;

    /**
     * Hàm setUp() chạy TRƯỚC mỗi test method.
     */
    protected void setUp() {
        // 1. Cab: ID 1, 4 khách, giá 2$ / dặm
        cab = new Cab(1, 4, 2);

        // 2. Limo: ID 2, 6 khách, giá 4$ / dặm, Giá tối thiểu (minRental) là 50$
        limo = new Limo(2, 6, 4, 50);

        // 3. Van: ID 3, 10 khách, giá 3$ / dặm, có lối đi cho xe lăn

        van = new Van(3, 10, 3, true);
    }

    /**
     * Test 1: Kiểm tra tính cước phí (Fare)
     */
    public void testFare() {
        // --- Test Cab ---
        // Đi 10 dặm. Giá 2$/dặm -> Tổng: 20
        assertEquals(20, cab.Fare(10)); 


        // --- Test Limo ---
        // Case 1: Đi ngắn (5 dặm). Tính theo km: 5 * 4 = 20$. 
        // Nhưng MinRental là 50$. -> Phải trả 50$.
        assertEquals(50, limo.Fare(5)); 


        // Case 2: Đi dài (20 dặm). Tính theo km: 20 * 4 = 80$.
        // 80$ > 50$ -> Trả theo thực tế là 80$.
        assertEquals(80, limo.Fare(20));

        // --- Test Van ---
        // Đi 10 dặm. Giá 3$/dặm = 30$. Cộng thêm 10 khách = 40$.
        assertEquals(40, van.Fare(10));
    }

    /**
     * Test 2: Kiểm tra lowerPrice
     */
    public void testLowerPrice() {
        // Cab đi 10 dặm (giá 20). So sánh với số tiền 25.
        assertTrue(cab.lowerPrice(10, 25));
        
        // Cab đi 10 dặm (giá 20). So sánh với số tiền 15.
        assertFalse(cab.lowerPrice(10, 15));
    }

    /**
     * Test 3: Kiểm tra cheaperThan (So sánh 2 xe)
     */
    public void testCheaperThan() {
        // So sánh Cab vs Limo trên quãng đường 10 dặm
        // Cab: 10 * 2 = 20$
        // Limo: 10 * 4 = 40$ (nhưng min là 50$) -> Lấy 50$
        
        // Cab (20) rẻ hơn Limo (50) -> True
        assertTrue(cab.cheaperThan(limo, 10));
        
        // Limo (50) rẻ hơn Cab (20) -> False
        assertFalse(limo.cheaperThan(cab, 10));
        
        // So sánh Cab vs Van trên quãng đường 10 dặm
        // Cab: 20$
        // Van: 10 * 3 + 10 (khách) = 40$
        assertTrue(cab.cheaperThan(van, 10));
    }
}