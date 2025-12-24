package E5_13;

public class BookList implements IBook {
	//properties
	private ABook first;
	private IBook rest;
	//constructor
	public BookList(ABook first, IBook rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public IBook thisAUthor(String authorName) {
		// use equals for string comparison
		if(this.first.getAuthor().equals(authorName)) {
			return new BookList(this.first, this.rest.thisAUthor(authorName));
		}
		else {
			return this.rest.thisAUthor(authorName);
		}
	}
	@Override
	public IBook insertByTitle(ABook that) {
		if(this.first.getTitle().compareToIgnoreCase(that.getTitle()) <= 0) {
			return new BookList(this.first, this.rest.insertByTitle(that));
		}
		else {
			return new BookList(that, this);
		}
	}
	@Override
	public IBook SortByTitle() {
		return this.rest.SortByTitle().insertByTitle(this.first);
	}
	
	@Override
	public String toString() {
		// Concatenate the first book's toString with the rest of the list.
		return this.first.toString() + this.rest.toString();
	}
	
	
}