package onClass;

import junit.framework.TestCase;

public class Testing extends TestCase {
	public void testConstructor() {
		AStore juice1 = new Juice("Phuc Long", "tra cay trai", 200, 30.99, "sweet", 2);
		AStore coffee1 = new Coffee("Starbuk", "ca phe phe", 150.5, 15.7, true);
		AStore icream1 = new Icream("Mixue", "kem sua tran chau",	 230.9, 18.4, 1);
		
		IStore mt = new MTstore();
		IStore L1 = new ConsStore(juice1, mt);
		IStore L2 = new ConsStore(coffee1, L1);
		IStore all = new ConsStore(icream1, L2);
		
		IBrandList test = new ConsBrandList("abc", new MTBrandList());
	}
	
	public void testMethod() {
		AStore juice1 = new Juice("Phuc Long", "tra cay trai", 200, 30.99, "sweet", 2);
		AStore coffee1 = new Coffee("Starbuk", "ca phe phe", 150.5, 15.7, true);
		AStore icream1 = new Icream("Mixue", "kem sua tran chau",	 230.9, 18.4, 1);
		
		IStore mt = new MTstore();
		IStore L1 = new ConsStore(juice1, mt);
		IStore L2 = new ConsStore(coffee1, L1);
		IStore all = new ConsStore(icream1, L2);
		
		assertEquals(3,all.howMany());

		assertEquals(all.brandlist(),new ConsBrandList("Mixue",
				new ConsBrandList("Starbuk",
						new ConsBrandList("Phuc Long", new MTBrandList()))));
		
		assertEquals(all.highestPrice(), juice1.unitPrice());
	}
}
