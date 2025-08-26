package com.example.addressbook;

import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook("MyBook");

        System.out.println("Add a Contact");
        System.out.print("First Name: ");
        String fName = sc.nextLine();
        System.out.print("Last Name: ");
        String lName = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Zip: ");
        int zip = Integer.parseInt(sc.nextLine());
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Contact contact = new Contact(fName, lName, address, city, state, zip, phone, email);
        addressBook.addContact(contact);

        System.out.println("Contacts in AddressBook:");
        addressBook.getContacts().forEach(System.out::println);
        
        
        System.out.println("Do you want to Edit an existing contact? Y/N");
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Yes")) {
        	
        	System.out.println("Enter the firstname you want to edit");
        	String firstname = sc.nextLine();
        	if(firstname!=null) {
        		addressBook.editContact(firstname, new Scanner(System.in));
        	}
        	
        }
        
        
        System.out.println("Do you want to delete an existing contact? Y/N");
        String choice2 = sc.nextLine();
        if(choice2.equalsIgnoreCase("Y") || choice2.equalsIgnoreCase("Yes")) {
        	
        	System.out.println("Enter the firstname you want to delete");
        	String firstname = sc.nextLine();
        	if(firstname!=null) {
        		addressBook.deleteContact(firstname);
        	}
        	
        }
        sc.close();
    }
}

