package E5_8;

public class Cinventory implements Inventory{
	//properties
	private Toy first;
	private Inventory rest;
	/**
	 * constructor
	 * @param first
	 * @param rest
	 */
	public Cinventory(Toy first, Inventory rest) {
		this.first = first;
		this.rest = rest;
	}
	
	@Override
	public int PlusOne() {
		// TODO Auto-generated method stub
		return 1 + this.rest.PlusOne();
	}
	
	@Override
	public double getPrice() {
		return this.first.getPrice() + this.rest.getPrice();
	}
	
	@Override
	public double avgPrice() {
		int count = 0;
		double total = 0;
		count = 1 + this.rest.PlusOne();
		total = this.first.getPrice() + this.rest.getPrice();
		return total/count;
	}

	@Override
	public void replaceName() {
		this.first.replaceName();
		this.rest.replaceName();
	}

	@Override
	public Inventory eliminate(String toyOfName) {
		if(this.first.getName() != toyOfName) {
			return new Cinventory(this.first, this.rest.eliminate(toyOfName));
		}
		else {
			return this.rest.eliminate(toyOfName);
		}
	}
	
	@Override
	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}
	
	public String getToyName() {
		return this.first.getName();
	}

}
