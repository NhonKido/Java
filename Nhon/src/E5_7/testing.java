package E5_7;

import junit.framework.TestCase;

public class testing extends TestCase {

    private IStore sorbetIceCream;   // Kem sorbet
    private IStore regularCoffee;    // Cà phê thường
    private IStore freshJuice;       // Nước ép tươi
    private IStore expensiveCoffee;  // Cà phê đắt tiền
    

    protected void setUp() {

        // Brand: Vinamilk, Weight: 100g, Price: 2000, FlavorCode: 1 (sorbet)
        // -> Unit Price = 2000 / 100 = 20.0
        sorbetIceCream = new iCream("Vinamilk", 100.0, 2000.0, 1);
        
        // Brand: Highlands, Weight: 50g, Price: 500, IsRegular: true
        // -> Unit Price = 500 / 50 = 10.0
        regularCoffee = new Coffee("Highlands", 50.0, 500.0, true);
        
        // Brand: Tropicana, Weight: 200g, Price: 400, FlavorCode: 2 (fresh)
        // -> Unit Price = 400 / 200 = 2.0
        freshJuice = new Juice("Tropicana", 200.0, 400.0, 2);
        
        // Brand: Starbucks, Weight: 10g, Price: 1000, IsRegular: false
        // -> Unit Price = 1000 / 10 = 100.0
        expensiveCoffee = new Coffee("Starbucks", 10.0, 1000.0, false);
    }
    
    public void testNewStuff() {
    	IShoplist empty = new MTShopList();
    	IShoplist Item1 = new ConsShopList(sorbetIceCream, empty);
    IShoplist Item2 = new ConsShopList(freshJuice, Item1);
    IShoplist Item3 = new ConsShopList(expensiveCoffee, Item2);
    
    	System.out.println(Item2.howMany());
    	System.out.println(Item2.brandList());
    	System.out.println(Item2.highestPrice());
    }

}