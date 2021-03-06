package com.Bridgelabz.addressbook;

import java.util.Objects;

public class Contacts {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String email;
	private int zip;
	private int phoneNumber;
	private String state;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddresse(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getZip() {
		return zip;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return (firstName + lastName)+": "+"Enter first name :"+ firstName + ", Enter Last name: "+ lastName +
				",Enter address: "+ address + ", Enter city: "+ city + ", Enter state: "+ state + ", Enter email id: "+ email +
				", Enter zip: "+ zip + ", Enter Phone Number: "+ phoneNumber ;
		
	}
	
	public int hashcode() {
		return Objects.hash(firstName, lastName, address, city, state, email, zip, phoneNumber);
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
		return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Contacts other = (Contacts) obj;
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && phoneNumber == other.phoneNumber
				&& Objects.equals(state, other.state) && zip == other.zip;
	}
}
