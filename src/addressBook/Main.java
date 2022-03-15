package addressBook;

import java.util.Scanner;

public class Main {
	 Scanner sc = new Scanner(System.in);

	public int mainMenu() {
        System.out.println(" 1.Add Contact");
        System.out.println(" 2.Edit Contact");
        System.out.println(" 3.Delete Contact");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        return sc.nextInt();
    }

    public void userSelection() {
        ContactDetail contactDetail = new ContactDetail();
      
        loop :do {
        	int choice = mainMenu();
            switch(choice) {
            case 1:
                contactDetail.addNewContact();
                System.out.println("Contact added ");
                break;
            case 2: 
            	contactDetail.editContactDetail(ScannerUtil.getString("Enter the First name to edit: "));
            	System.out.println("Contact edited ");
                break;
            case 3: 
            	contactDetail.deleteContactDetail(ScannerUtil.getString("Enter the First name to delete: "));
            	System.out.println("Contact Deleted ");
                break;
            case 4: 
            	break loop;
            	
            }
        } while (true);
    }
	
	public static void main(String[] args) {

//		 System.out.println("Welcome to Address Book Program ");
//		
//		AddressBook obj = new AddressBook ("abc","XYZ","22 E","qwer", "TN", "626109","987654354","abc@def.com");
//        System.out.println(obj.firstName);
//        System.out.println(obj.lastName);
//        System.out.println(obj.address);
//        System.out.println(obj.city);
//        System.out.println(obj.state);
//        System.out.println(obj.zip);
//        System.out.println(obj.phoneNumber);
//        System.out.println(obj.email);
//		  System.out.println(obj.address);
//		
		Main usermenu = new Main();
		usermenu.userSelection();
	}
	
}
	   
