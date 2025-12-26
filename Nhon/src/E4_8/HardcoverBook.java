package E4_8;

public class HardcoverBook extends ABook {

	public HardcoverBook(String title, String author,double price, int publicationYear) {
		super (title, author, price, publicationYear);
	}

   public double salePrice()  {
      return this.price * 0.8;
   }
}
