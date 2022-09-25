package java81;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Book> getBook()
	{
		List<Book> books=new ArrayList<Book>();
		books.add(new Book(101, "Core Java", 400));
		books.add(new Book(363, "Hibernet", 180));
		books.add(new Book(275, "Spring", 200));
		books.add(new Book(893, "WebService", 300));
		
		return books;
		
	}

}
