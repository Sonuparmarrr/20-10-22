package exception.assignment;

public class Book {
		private int Bookid;
		private String BookName;
		//Construtor for Book
		public Book(int Bookid, String BookName) {
			this.Bookid=Bookid;
			this.setBookName(BookName);
		}
		//Get Method for BOOKID
		public int getBookid() {
			return Bookid;
			
	}
		//Set Method for Book id
		public int setBookid( int Bookid) {
			return Bookid;
			
	}
		//Get Method for BOOKname
		public String getBookName() {
			return BookName;
		}
		//Set Method for Book Name
		public void setBookName(String bookName) {
			BookName = bookName;
		}
		public String toString() {
			return "Book [BookId=" + Bookid + ", BookName=" + BookName + "]";
		
}
}	
