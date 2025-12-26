package E4_3;

import junit.framework.TestCase;

public class test extends TestCase {
	IVehicles bus1;
	IVehicles limos1;
	IVehicles subways1,subways2;
	IVehicles car1;
	//test constructor
	public void testALLconstructor() {
		bus1 = new Bus(4848.4, "basic school bus", false, 16, false);
		limos1 = new Limos(13133.3, "xe bat coc", true, 2, "cambodia's international kidnapping Limos");
		subways1 = new Subways(1419491944040.0, "Titanic", false, 1000,200);
		subways2 = new Subways(22322424224422332.9, "king of contain", true, 202805258252080L, 100);
		car1 = new Car(0, "xe cho phan", true, "truck", 250);
	}
	
}
