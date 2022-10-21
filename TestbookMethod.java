package exception.assignment;

public class TestbookMethod {
public static void main(String[] args) {
		Book[] book = new Book[6];
	
		book[0] = new Book(1, "Java");
		book[1] = new Book(2, "MySQL");
		book[2] = new Book(3, "Testing");
		book[3] = new Book(4, "OOPS");
		book[4] = new Book(5, "HTML");
		try {
			if(findById(book,10)) {
				System.out.println("Book is present");
			}
			else{
				throw new BookNotFoundException("Book with the given id is not present");
			}
		}
		catch(BookNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//findby id method
	public static boolean findById(Book[] books , int id) {
		for(Book b:books) {
			if(b.getBookid()==id)
			return true;
		}
		return false;
	}
}