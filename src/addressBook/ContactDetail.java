package addressBook;

import java.util.ArrayList;
import java.util.List;

	public class ContactDetail {
	    private final List<Contact> contactList = new ArrayList<>();


	    public void addNewContact() {
	        Contact contact = new Contact();

	        contact.setFirstName(ScannerUtil.getString("Enter First name: "));
	        contact.setLastName(ScannerUtil.getString("Enter Last name: "));
	        contact.setAddress(ScannerUtil.getString("Enter Address: "));
	        contact.setCity(ScannerUtil.getString("Enter City: "));
	        contact.setState(ScannerUtil.getString("Enter State: "));
	        contact.setZip(ScannerUtil.getInt("Enter Zip code: "));
	        contact.setPhoneNumber(ScannerUtil.getLong("Enter Phone number: "));
	        contact.setEmail(ScannerUtil.getString("Enter Email: "));
	       

	        contactList.add(contact);

	    }
	    public void editContactDetail(String name) {
	    	 
	    	for(Contact contact: contactList) {
	    		if(name.equalsIgnoreCase(contact.firstName)) {
	    			editContact(contact);
	    		}
	    	}
	    }
	    
	    public void editContact(Contact contact) {

	        contact.setFirstName(ScannerUtil.getString("Enter the new First name: "));
	        contact.setLastName(ScannerUtil.getString("Enter the new Last name: "));
	        contact.setAddress(ScannerUtil.getString("Enter the new Address: "));
	        contact.setCity(ScannerUtil.getString("Enter the new City: "));
	        contact.setState(ScannerUtil.getString("Enter the new State: "));
	        contact.setZip(ScannerUtil.getInt("Enter the new Zip code: "));
	        contact.setPhoneNumber(ScannerUtil.getLong("Enter the new Phone number: "));
	        contact.setEmail(ScannerUtil.getString("Enter the new Email: "));
	       
	    	
	    }
	    
	    public void deleteContactDetail(String name) {
	    	 
	    	for(Contact contact: contactList) {
	    		if(name.equalsIgnoreCase(contact.firstName)) {
	    			contactList.remove(contact);
	    		}
	    	}
	    }

	}