package com.Bridgelabz.addressbook;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBookManager {
	List<Contacts> addressBookList = newArrayList();

	void addContact(Contacts address) {
		addressBookList.add(address);
	}

	private List<Contacts> newArrayList() {
		// TODO Auto-generated method stub
		return null;
	}

	void printContacts() {
		for(Contacts Items: addressBookList) {
			System.out.println(Items);
		}
	}

	void addcontactasadetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Name: ");
		String firstName = sc.next();
		System.out.println("\nEnter last Name: ");
		String lastName = sc.next();
		System.out.println("\nEnter address: ");
		String address = sc.next();
		System.out.println("\nEnter city: ");
		String city = sc.next();
		System.out.println("\nEnter state: ");
		String state = sc.next();
		System.out.println("\nEnter email: ");
		String email = sc.next();
		System.out.println("\nEnter zip: ");
		String zip = sc.next();
		System.out.println("\nEnter phone number: ");
		String phoneNumber = sc.next();

		Contacts contact = new Contacts();
		contact.setFirstName(firstName);
		contact.setFirstName(lastName);
		contact.setFirstName(address);
		contact.setFirstName(city);
		contact.setFirstName(state);
		contact.setLastName(email);
		contact.setFirstName(zip);
		contact.setLastName(phoneNumber);
		addContact(contact);
	}

	public void removeContactDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Contact name");
		String name = sc.next();
		Contacts contact = getContact(name);
		addressBookList.remove(contact);
		System.out.println("Deleted contact : "+contact);
	}

	Contacts getContact(String name) {
		Iterator iterator = addressBookList.iterator();
		for(Contacts elements : addressBookList) {
			if(iterator.hasNext()) {
				Contacts item = (Contacts) iterator.next();
				if(item.getFirstName().equalsIgnoreCase(name)) {
					return item;
				}
			}
		}
		return null;
	}

	public void updateContactDetails() {
		System.out.println("Enter contact entity");
		Scanner sc = new Scanner(System.in);
		String item = sc.next();
		Contacts bookItem = getContact(item);
		System.out.println(bookItem);
		
		System.out.println("1. update firstname");
		System.out.println("2. update Lastname");
		System.out.println("3. update address");
		System.out.println("4. update city");
		System.out.println("5. update state");
		System.out.println("6. update email");
		System.out.println("7. update zip");
		System.out.println("8. update phone number");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Enter new first name: ");
				String fname = sc.next();
				bookItem.setFirstName(fname);
				break;
			case 2:
				System.out.println("Enter new last name: ");
				String lname = sc.next();
				bookItem.setLastName(lname);
				break;
			case 3:
				System.out.println("Enter new address: ");
				String address = sc.next();
				bookItem.setAddresse(address);
				break;
			 case 4:
				 System.out.println("Enter new city: ");
				 String city = sc.next();
				 bookItem.setCity(city);
	             break;
			 case 5:
				 System.out.println("Enter new State: ");
				 String state = sc.next();
				 bookItem.setState(state);
				 break;
			 case 6:
				 System.out.println("Enter new Email: ");
				 String email = sc.next();
				 bookItem.setEmail(email);
				 break;
			 case 7:
				 System.out.println("Enter new ZipCode: ");
				 int zip = sc.nextInt();
				 bookItem.setZip(zip);
				 break;
			 case 8:
				 System.out.println("Enter new phone number: ");
				 int phonnum = sc.nextInt();
				 bookItem.setPhoneNumber(phonnum);
				 break;
		}
		System.out.println("Updated details: "+bookItem);
	}

}
