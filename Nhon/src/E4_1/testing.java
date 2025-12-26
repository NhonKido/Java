package E4_1;

import junit.framework.TestCase;

public class testing extends TestCase {
	/**
	 * for CdACC: id, name, double interest, double currbalance, double date
	 * for SaveACC: id, name, interest, currbalance
	 * for checking : id, name, balance, double min currbalance
	 */
	private IBank Nhon;
	private IBank Ha;
	private final long NhonID = 2511130192L; 
	private final long HaID = 3511130192L; 
	
	//test constructor
	public void testALLconstructor() {
		Nhon = new SaveACC(NhonID, "Hoai Nhon Dang", 0.9, 1389391.8);
		//Nhon = new CheckingACC(//same ID, //same name, //same currbalance, 218198.9); cant!
		Nhon = new CdACC(HaID, "Hoai Nhon", 0.4, 2948948.9, 26);
		Ha = new CheckingACC(HaID, "Tuyet Haa", 4142425524142.9, 139138441.0);
	}
	
}
