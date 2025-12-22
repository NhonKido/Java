package E5_11;

public class MailList {
	private String from, mess;
	private Date date;
	private MailList rest;
	
	public MailList() {}

	public MailList(String from, String mess, Date date, MailList rest) {
		this.from = from;
		this.mess = mess;
		this.date = date;
		this.rest = rest;
	};
	
	public MailList insertMail(MailList that) {
		if(this.date == null) {return new MailList(that.from, that.mess, that.date, new MailList());}
		if(this.date.Older(that.date)) {
			return new MailList(this.from,this.mess,this.date,this.rest.insertMail(that));
		}
		return new MailList(that.from, that.mess, that.date,this);
	}
	
	public MailList SortDate() {
		if(this.date == null) {
			return new MailList();
		}
		MailList first = new MailList(this.from,this.mess,this.date,new MailList());
		return this.rest.SortDate().insertMail(first);
	}
	
	@Override
	public String toString() {
		if(this.from == null) {return "";}
		return this.from + "\n" + this.rest.toString();
	}
}
