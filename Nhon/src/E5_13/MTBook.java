package E5_13;

public class MTBook implements IBook {

	@Override
	public IBook thisAUthor(String authorName) {
		return this;
	}

	@Override
	public IBook insertByTitle(ABook that) {
		return new BookList(that, this);
	}

	@Override
	public IBook SortByTitle() {
		return new MTBook();
	}

	@Override
	public String toString() {
		return "";
	}

}