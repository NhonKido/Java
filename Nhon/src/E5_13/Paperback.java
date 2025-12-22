package E5_13;

public class Paperback extends ABook {
	   public Paperback(String title, String author, double price, int publicationYear) {
	      super(title, author, price, publicationYear);
	   }

	   public double salePrice() {
	      return this.price;
	   }
}