package library_Catlouge;

public class Book {

	String title;
	int pagecount;
	int ISBN;
	boolean isCheckedOut;
	int dayCheckedOut = -1;
	
	public Book(String bookTitle,int bookPageCount,int bookISBN) {
		this.title = bookTitle;
		this.pagecount = bookPageCount;
		this.ISBN = bookISBN;
		isCheckedOut = false;
	}
	
//	Getters
	
	public String getTitle() {
		return this.getTitle();
	}
	
	public String getPageCount() {
		return this.getPageCount();
	}
	public String getISBN() {
		return this.getISBN();
	}
	public String getIsCheckedOut() {
		return this.getIsCheckedOut();
	}
	public String getDayCheckedOut() {
		return this.getDayCheckedOut();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
