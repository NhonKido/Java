package E5_13;

public class Sale extends ABook {
	   public Sale(String title, String author,double price, int publicationYear) {
	      super(title, author, price, publicationYear);
	   }
	   public double salePrice() {
	      return this.price * 0.5;
	   }
	}
