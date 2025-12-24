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
   
   public String getAuthor(){
	  return this.author;
   }
   
   public String getTitle(){
	   return this.title;
   }
   
   @Override
   public String toString() {
       // Provide a concise, human-readable representation for a book.
       // Example: "Java Core by Nhon (2020) - $100.00"
       return this.title + " by " + this.author + " (" + this.publicationYear + ") - $" + String.format("%.2f", this.price) + "\n";
   }
   
}