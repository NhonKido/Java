package E5_7;

public class ConsShopList implements IShoplist {
	private IStore first;
	private IShoplist rest;
	
	public ConsShopList(IStore first, IShoplist rest) {
		this.first = first;
		this.rest = rest;
	}
	
	@Override
	public int howMany() {
		return 1 + this.rest.howMany();
	}

	@Override
	public String brandList() {
		return this.first.brandList() +"\n" + this.rest.brandList();
	}

	@Override
	public double highestPrice() {
		return Math.max(this.first.unitPrice(), this.rest.highestPrice());
	}
}
