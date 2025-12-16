package E5_4;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
        
        Person unknown = new Person();

        // Bob (1917) là bố của Annie
        Person bob = new Person("Bob", 1917, unknown, unknown);
        
        // Annie (1938) có bố là Bob, mẹ không rõ
        Person annie = new Person("Annie", 1938, bob, unknown);
        
        // Paul (1956) có bố không rõ, mẹ là Annie
        Person paul = new Person("Paul", 1956, unknown, annie);

        // Robert (1935) và Angela (1936)
        Person robert = new Person("Robert", 1935, unknown, unknown);
        Person angela = new Person("Angela", 1936, unknown, unknown);
        
        // Janet (1958) là con của Robert và Angela
        Person janet = new Person("Janet", 1958, robert, angela);

        // Peter là con của Paul và Janet
        Person peter = new Person("Peter", 1980, paul, janet);
	}

}
