package functions;

public class BookClasses {
	private int no;
	private String bookId;
	private String bookName;
	private String authorName;
	
	public BookClasses(int no, String bookId, String bookName, String authorName) {
		super();
		this.no = no;
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	public BookClasses(String bookId, String bookName, String authorName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	public BookClasses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "BookClasses [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName
				+"]";
	}

}
