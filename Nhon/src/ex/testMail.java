package ex;

import junit.framework.TestCase;

public class testMail extends TestCase {
	public void testing() {
		Date d1,d2;
		d1 = new Date(26,7,3006);
		d2 = new Date(3,4,3007);
		MailList mt = new MailList();
		MailList mail1 = new MailList("Ha","helloo",d1,mt);
		MailList mail2 = new MailList("Nhon","hi",d2,mail1);
		System.out.println(mail2.toString());
		mail2 = mail2.SortDate();
		
		System.out.println(mail2.toString());
	}
}
