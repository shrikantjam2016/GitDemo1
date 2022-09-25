package java81;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
	
	public List<Book> getBookSort(){
		List<Book> books=new BookDao().getBook();
		Collections.sort(books, (a,b)->b.getName().compareTo(a.getName()));
		return books;
	}
	
	public static void main(String[] args) {
		System.out.println(new BookService().getBookSort());
		
		List<String> ab=new BookService().getBookSort().stream().map(BookDao->BookDao.getName()).collect(Collectors.toList());
		
		System.out.println(ab);
	}

}

/*
 * class MyComparator implements Comparator<Book> {
 * 
 * @Override public int compare(Book o1, Book o2) {
 * 
 * return o2.getName().compareTo(o1.getName()); }
 * 
 * }
 */
