package E4_1;

/**
 * this main file used by me to understand more about these class \ <._.> /
 */																	

public class main {

	public static void main(String[] args) {

		IBank test = new CdACC(121,"nhon",0.22,123.4,9);
		//expected to print out id, name and current balance
		test.printTest();
		
		IBank Ha = new SaveACC(11331,"Haa",0.33,48299428);
		//expected to print out nothing:))
		Ha.printTest();
		
		// cannot : IBank Nhoon = new Bank();

	}

}
