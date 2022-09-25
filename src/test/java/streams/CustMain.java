package streams;

import java.util.List;
import java.util.stream.Collectors;

public class CustMain {
	public static void main(String[] args) {
		
		List<Customer> cust=CustDB.getAll();
		
		List<String> email=cust.stream().map(customers->customers.getEmail()).collect(Collectors.toList());
		System.out.println(email);
		
		//Phone number. 
		List<List<String>> phone=cust.stream().map(customers1->customers1.getPhoneNumber()).collect(Collectors.toList());
		System.out.println(phone);
		
		
		//Phone number. 
		List<String>phone1=cust.stream().flatMap(customers1->customers1.getPhoneNumber().stream()).collect(Collectors.toList());
		System.out.println(phone1);
	}

}
