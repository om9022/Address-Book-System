package com.Bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain { 
	AddressBookManager addressBookManager = new AddressBookManager();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------Welcome To AddressBook----------");

		AddressBookMain mainObj = new AddressBookMain();
		boolean flag = true;

		do {
			System.out.println("Enter a choice");

			System.out.println("1.Add new person in address book");
			System.out.println("2.Update person in address book");
			System.out.println("3.Remove person in address book");
			System.out.println("4.Get person detail from  address book");
			System.out.println("5.Print Address book");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				mainObj.addressBookManager.addcontactasadetails();
				break;
			case 2:
				mainObj.addressBookManager.updateContactDetails();
				break;
			case 3:
				mainObj.addressBookManager.removeContactDetails();
				break;
			case 4:
				System.out.println("Enter contact name: ");
				String name = sc.next();
				Contacts details = mainObj.addressBookManager.getContact(name);
				System.out.println("Contact details = "+details);
				break;
			case 5:
				mainObj.addressBookManager.printContacts();
				break;
			default:
				flag = false;				
			}
		}
		while(flag);
	}

}
