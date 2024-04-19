import java.io.Serializable;

public class Book implements Serializable {
	private String bookName;
	private int bookYear;
	private Author author;
	
	public Book() {
		
	}
	
	public Book(String bookName, int bookYear, Author author) {
		this.bookName = bookName;
		this.bookYear = bookYear;
		this.author = author;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public int getBookYear() {
		return bookYear;
	}
	
	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}
	
	public Author getAuthor () {
		return author;
	}
	
	public void setAuthor (Author author) {
		this.author = author;
	}
	
	@Override
	public int hashCode() {
		return this.bookYear + this.bookName.hashCode();
	}
	
	@Override
	public boolean equals (Object o) {
		Book book = (Book)o;
		return this.bookName.equals(book.bookName) && this.author.equals(book.author);
		
	}

	@Override
	public String toString () {
		return "KİTABIN ADI: " + bookName + "\t KİTABIN BASIM YILI: " + bookYear+ "\t" +author; 
	}
	

}
