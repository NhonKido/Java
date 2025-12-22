package E5_13;
public abstract class ABook {
   protected String title;
   protected String author;
   protected double price;
   protected int publicationYear;
   public ABook(String title, String author,double price, int publicationYear){
      this.title =title;
      this.author = author;
      this.price = price;
      this.publicationYear = publicationYear;
   }

   public abstract double salePrice();
   public boolean cheaperThan(ABook that){
      return this.salePrice() < that.salePrice();
   }
   public boolean sameAuthor(ABook that){
      return this.author.equals(that.author);
   }
}
