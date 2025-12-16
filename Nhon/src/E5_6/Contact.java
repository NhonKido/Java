package E5_6;

public class Contact {
	//properties
	private Contact rest;
	private long PhoneNum;
	private String name;
	
	//empty contact
	public Contact() {};
	//contain list of contact
	/**
	 * main constructor
	 * @param PhoneNum
	 * @param name
	 * @param rest
	 */
	public Contact(long PhoneNum, String name, Contact rest) {
		this.PhoneNum = PhoneNum;
		this.name = name;
		this.rest = rest;
	}
	
	public String WhoseNum(long thatNum) {
		if (this.name==null) {return "this contact belong to no one";}
		if(this.PhoneNum==thatNum) {
			return this.name;
		}
		return this.rest.WhoseNum(thatNum);
	}
	
	public long GetphoneNum(String thatName) {
		if(this.name==null) {System.out.println(thatName + " is not saved in contact.");}
		if(this.name==thatName) {return this.PhoneNum;}
		return this.rest.GetphoneNum(thatName);
	}
}
