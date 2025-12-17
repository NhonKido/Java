package E5_8;

import junit.framework.TestCase;

public class testing extends TestCase {
	private Toy adultToy, babyToy, TeenToy;
	private Inventory mt, bag1, bag2, bag3;
	
	public void testInventory() {
		adultToy = new Toy("crystal knife", 92891.2, "Jappan");
		babyToy = new Toy("not deer",0,"unknow");
		TeenToy = new Toy("girl from the abyss",20.0, "not in earth");
		mt = new MTInventory();
		bag1 = new Cinventory(adultToy, mt);
		bag2 = new Cinventory(babyToy,bag1);
		bag3 = new Cinventory(TeenToy, bag2);
		
		
		System.out.println(bag3.toString());
		
		
		//after eliminate
		System.out.println(bag3.eliminate("not deer").toString());
		//(92891.2 + 0 + 20) /3 = 30,970.4
		System.out.println(bag3.avgPrice());
		//test replace name
		Inventory bag4 = new Cinventory(new Toy("robot",90.6,"chini"),bag3);
		bag4.replaceName();
		System.out.println(bag4.getToyName());
		
	}
	
}
