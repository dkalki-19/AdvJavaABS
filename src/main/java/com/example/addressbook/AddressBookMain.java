package com.example.addressbook; 

import java.util.Scanner;

public class AddressBookMain {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter First Name:");
	        String firstName = sc.next();
	        System.out.println("Enter Last Name:");
	        String lastName = sc.next();
	        System.out.println("Enter Address:");
	        String address = sc.next();
	        System.out.println("Enter City:");
	        String city = sc.next();
	        System.out.println("Enter State:");
	        String state = sc.next();
	        System.out.println("Enter Zip:");
	        int zip = sc.nextInt();
	        System.out.println("Enter Phone Number:");
	        String phone = sc.next();
	        System.out.println("Enter Email:");
	        String email = sc.next();

	        Contact contact = new Contact(firstName, lastName, address, city, state, email, phone, zip);
	        System.out.println("Contact Added: " + contact);
	    }
}
