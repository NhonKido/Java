package E4_1;

public class SaveACC extends Bank{
	//properties
	private double interestRate;
	private double curBalance;
	//this is the constructor
	public SaveACC(long idNum,String CusName,double interestRate, double curBalance) {
		this.idNum = idNum;
		this.CusName = CusName;
		this.interestRate = interestRate;
		this.curBalance = curBalance;
	}
	
	@Override
	public void printTest() {
		
	}
	
}
