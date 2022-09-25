package streams;

import java.util.Arrays;
import java.util.Optional;

public class OpionlaDemo {
	public static void main(String[] args) {
		Customer c=new Customer(102, "John", "abc", Arrays.asList("123456","12365"));
		
		Optional<Object> ob=Optional.empty();
		System.out.println(ob);
		
		/*
		 * Optional<String> op1=Optional.of(c.getEmail()); System.out.println(op1);
		 */
				
		Optional<String> op2=Optional.ofNullable(c.getEmail());
		if(op2.isPresent())
		{
			System.out.println(op2.get());
		}
		
	}

}
