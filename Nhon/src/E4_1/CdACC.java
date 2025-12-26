package E4_1;

public class CdACC extends Bank{
	//properties
	private double interestRate;
	private double curBalance;
	private double maturityDate;
	//this is the constructor
	public CdACC(long idNum,String CusName,double interestRate, double curBalance, double maturityDate) {
		this.idNum = idNum;
		this.CusName = CusName;
		this.interestRate = interestRate;
		this.curBalance = curBalance;
		this.maturityDate = maturityDate;
	}
	
	@Override
	public void printTest() {
		System.out.printf("id: %s; customer: %s ; current balance: %s ;",this.idNum,this.CusName, this.curBalance);
	}
	
}
