package E4_1;

public class CheckingACC extends Bank{
	//properties
	private double curBalance;
	private double minBalance;
	//this is the constructor
	public CheckingACC(long idNum,String CusName,double curBalance, double minBalance) {
		this.idNum = idNum;
		this.CusName = CusName;
		this.curBalance = curBalance;
		this.minBalance = minBalance;
	}
	

	
}
