package E5_4;

public class Person {
	//properties of a person
	private String name;
	private int birthY;
	//properties of this person family
	private Person father, mom;
	//if we don't know this person / father / mom;
	public Person() {}
	/**
	 * constructor
	 * @param name
	 * @param birthY
	 * @param father
	 * @param mom
	 */
	public Person(String name, int birthY, Person father, Person mom) {
		this.name = name;
		this.birthY = birthY;
		this.father = father;
		this.mom = mom;
	};
	
}
