package E5_12;

public class ConsShopList implements IShopList {
	private IStore first;
	private IShopList rest;
	
	/**
	 * constructor
	 * @param first
	 * @param rest
	 */
	public ConsShopList(IStore first, IShopList rest) {
		this.first = first;
		this.rest = rest;
	}

	@Override
	public int howMany() {
		return 1 + this.rest.howMany();
	}

	@Override
	public IShopList brandList(String thatBrand) {
		if(this.first.brand()==thatBrand) {
			return new ConsShopList(this.first
					,this.rest.brandList(thatBrand));
		}
		return this.rest.brandList(thatBrand);
	}

	@Override
	public double highestPrice() {
		return Math.max(this.first.unitPrice()
				,this.rest.highestPrice());
	}

}
