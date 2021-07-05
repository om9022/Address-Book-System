package com.Bridgelabz.addressbook;

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
	
	void addaacontactasadetails() {
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
	
	void removeItem(Contacts address) {
		addressBookList.remove(address);
	}

}
