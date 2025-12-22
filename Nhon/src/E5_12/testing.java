package E5_12;

import junit.framework.TestCase;

public class testing extends TestCase {

    private IStore sorbetIceCream;   // Kem sorbet
    private IStore regularCoffee;    // Cà phê thường
    private IStore freshJuice;       // Nước ép tươi
    private IStore expensiveCoffee;  // Cà phê đắt tiền
    
    /**
     * Hàm setUp() chạy TRƯỚC mỗi test method.
     * Dùng để khởi tạo dữ liệu sạch cho từng lần test.
     */
    protected void setUp() {

        // Brand: Vinamilk, Weight: 100g, Price: 2000, FlavorCode: 1 (sorbet)
        // -> Unit Price = 2000 / 100 = 20.0
        sorbetIceCream = new iCream("Vinamilk", 100.0, 2000.0, 1);
        
        // Brand: Highlands, Weight: 50g, Price: 500, IsRegular: true
        // -> Unit Price = 500 / 50 = 10.0
        regularCoffee = new Coffee("Highlands", 50.0, 500.0, true);
        
        // Brand: Tropicana, Weight: 200g, Price: 400, FlavorCode: 2 (fresh)
        // -> Unit Price = 400 / 200 = 2.0
        freshJuice = new Juice("Highlands", 200.0, 400.0, 2);
        
        // Brand: Starbucks, Weight: 10g, Price: 1000, IsRegular: false
        // -> Unit Price = 1000 / 10 = 100.0
        expensiveCoffee = new Coffee("Starbucks", 10.0, 1000.0, false);
    }

    /**
     * Test 1: Kiểm tra tính đơn giá (unitPrice)
     * Công thức: price / weight
     */
    public void testUnitPrice() {
        // iCream: 2000 / 100 = 20.0
        assertEquals(20.0, sorbetIceCream.unitPrice(), 0.001);
        
        // Coffee: 500 / 50 = 10.0
        assertEquals(10.0, regularCoffee.unitPrice(), 0.001);
        
        // Juice: 400 / 200 = 2.0
        assertEquals(2.0, freshJuice.unitPrice(), 0.001);
        
        // Expensive Coffee: 1000 / 10 = 100.0
        assertEquals(100.0, expensiveCoffee.unitPrice(), 0.001);
    }

    /**
     * Test 2: Kiểm tra phương thức lowerPrice(amount)
     * Logic: unitPrice < amount -> true
     */
    public void testLowerPrice() {
        // Test với iCream (Unit Price = 20.0) 
        assertTrue(sorbetIceCream.lowerPrice(25.0)); 
        assertFalse(sorbetIceCream.lowerPrice(15.0)); 
        assertFalse(sorbetIceCream.lowerPrice(20.0));
        
        // Test với Juice (Unit Price = 2.0)
        assertTrue(freshJuice.lowerPrice(5.0));      
        assertFalse(freshJuice.lowerPrice(1.0));      
    }

    /**
     * Test 3: Kiểm tra phương thức cheaperThan(cost)
     * Logic: price < cost -> true (So sánh tổng giá tiền)
     */
    public void testCheaperThan() {
        //Test với Regular Coffee (Price = 500.0)
        assertTrue(regularCoffee.cheaperThan(600.0)); 
        assertFalse(regularCoffee.cheaperThan(400.0)); 
        
        // Test với Expensive Coffee (Price = 1000.0)
        // So sánh với Regular Coffee (500)
        assertFalse(expensiveCoffee.cheaperThan(500.0));
        
        // --- Test với Juice (Price = 400.0) ---
        assertTrue(freshJuice.cheaperThan(401.0));    
        assertFalse(freshJuice.cheaperThan(399.0)); 
    }
    
    public void testNewMethod() {
    	
    	//initialize list of items
    	IShopList mt = new MTShopList();
    	IShopList s1 = new ConsShopList(sorbetIceCream, mt);
    	IShopList s2 = new ConsShopList(freshJuice,s1);
    	IShopList s3 = new ConsShopList(expensiveCoffee,s2);
    	IShopList fullList = new ConsShopList(regularCoffee,s3);
    	
    	//test howmany()
    	assertEquals(4, fullList.howMany());
    	//test brandList()
    	IShopList brandList = fullList.brandList("Highlands");
    	assertEquals(2, brandList.howMany());
    	//test highestPrice()
    	assertEquals(100.0, fullList.highestPrice(), 0.001);
	}
    
}