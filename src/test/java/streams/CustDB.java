package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustDB {
	
	public static List<Customer> getAll()
	{
		return Stream.of(
				new Customer(101, "John", "john@gmail.com", Arrays.asList("4659782","3215697")),
				new Customer(102, "Smith", "smith@gmail.com", Arrays.asList("7667665","412357")),
				new Customer(103, "Peter", "peter@gmail.com", Arrays.asList("7539642","1564235")),
				new Customer(104, "Kely", "kely@gmail.com", Arrays.asList("85241637","3579864"))
				).collect(Collectors.toList());
	}

}
