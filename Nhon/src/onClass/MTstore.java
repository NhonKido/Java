package onClass;

public class MTstore implements IStore{

	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IBrandList brandlist() {
		return new MTBrandList();
	}

	@Override
	public double highestPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
