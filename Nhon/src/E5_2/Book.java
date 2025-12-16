package E5_2;
public class Book {
	//properties for a single book
	private String author,title;
	private int publicYear;
	private double price;
	//properties only for list of books
	private Book first, rest;
	/**
	*empty book constructor
	*/
	public Book() {}	
	/**
	 * constructor for create a single book
	 * @param author
	 * @param title
	 * @param publicYear
	 * @param price
	 */
	public Book(String author, String title, int publicYear, double price) {
		this.author = author; this.title = title;
		this.publicYear = publicYear; this.price = price;
	}
	/**
	 * constructor for book list
	 * @param first
	 * @param rest
	 */
	public Book(Book first, Book rest) {
		this.first = first;
		this.rest = rest;
	}
	
	/**
	 * đẳng cấp toString đệ quy cấp vũ trụ, iq 140.
	 * 								- Gemini truy poi ô.
	 */
	@Override
	public String toString() {
		//xác định đây có phải book empty hay không
		if(this.first==null && this.title == null) {return "";}
		//đây là 1 book list vì biến first đã được gán - (line 8)
		if(this.first != null) {
			return this.first.toString() +"\n" + this.rest.toString();
		}
		/**
		 * khi this.first.toString ở line 44 chạy đến cụ thể 1 cuốn sách
		 * khi ấy các properties mặc định như author,price... đã được gán giá trị
		 * còn các properties như first, rest đều là null -> Book first; chỉ khởi tạo, k gán gtri
		 * ==> a single book, not list of books
		 */
		return String.format("author: %s , title: %s , public year: %s , price: %s"
				,this.author, this.title, this.publicYear, this.price);
	}
	
}
