package E5_12;

public class MTShopList implements IShopList {

	@Override
	public int howMany() {
		return 0;
	}

	@Override
	public IShopList brandList(String thatBrand) {
		return new MTShopList();
	}

	@Override
	public double highestPrice() {
		// TODO Auto-generated method stub
		return -1;
	}

}
