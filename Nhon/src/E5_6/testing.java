package E5_6;

import junit.framework.TestCase;

public class testing extends TestCase {

	public void testContact() {
		Contact mt = new Contact(); 
		Contact ba = new Contact(794855368L,"Ba",mt);
		Contact me = new Contact(843093499L, "Me", ba);
		Contact contact = me;
		System.out.println(contact.WhoseNum(79393994855368L));
		System.out.println(contact.WhoseNum(843093499L));
		System.out.println(contact.WhoseNum(794855368L));
		System.out.println(contact.GetphoneNum("Ba"));
		System.out.println(contact.GetphoneNum("Me"));
		System.out.println(contact.GetphoneNum("Aladin"));
	}

}
