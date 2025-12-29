package onClass;

public class ConsStore implements IStore{
	private AStore first;
	private IStore rest;
	

	public ConsStore(AStore first, IStore rest) {
		this.first = first;
		this.rest = rest;
	}


	@Override
	public int howMany() {
		return 1 + this.rest.howMany();
	}


	@Override
	public IBrandList brandlist() {
		return new ConsBrandList(this.first.getBrand(),this.rest.brandlist()) {
		};
	}


	@Override
	public double highestPrice() {
		return Math.max(this.first.unitPrice(), this.rest.highestPrice());
	}

}
