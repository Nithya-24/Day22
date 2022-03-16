package addressBook;

import java.util.*;

public class AddressBook {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phoneNumber;
	String email;
	
	 Scanner sc = new Scanner(System.in);
	 int book = sc.nextInt();
	 
	AddressBook( String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email ) {
		System.out.println("Enter the Persons Details ");
				
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	

	
	

}