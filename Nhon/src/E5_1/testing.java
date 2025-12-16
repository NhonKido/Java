package E5_1;

import junit.framework.TestCase;

public class testing extends TestCase {
	Address d1,d2;
	IHouse emty;
	AHouse house1,house2;
	IHouse ListHome1,list2;
	
	public void testConstructor() {
		//test Address class
		d1 = new Address(9, "Nguyen Van Tang", "Thu Duc");
		d2 = new Address(82, "Tran Hung Dao", "Ha Noi");
		//test MTHouse class
		emty = new MTHouse();
		//test AHouse class
		house1 = new AHouse("biet thu", 10, 18971987198.2, d2);
		house2 = new AHouse("nha ma am huhuhu", 3, 0.0, d1);
		//test ListHouse
		ListHome1 = new ListHouse(house1, emty);
		list2 = new ListHouse(house2, ListHome1);
		System.out.println(list2.toString());
		
		IHouse all = new ListHouse(house1,new ListHouse(house2, emty));
		System.out.println(all.toString());		
	}

}
