package com.example.addressbook;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {

	private final String name;
    private final List<Contact> contacts = new ArrayList<>();

    public AddressBook(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public List<Contact> getContacts() { return Collections.unmodifiableList(contacts); }

    // UC1 : Add contact 
    public boolean addContact(Contact contact) {
        if (contacts.contains(contact)) return false; // duplicate
        return contacts.add(contact);
    }
	
    //UC2
   
    public void editContact(String name) {
        for (Contact c : contacts) {
            if (c.firstName.equalsIgnoreCase(name)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter New City:");
                c.city = sc.next();
                System.out.println("Updated Contact: " + c);
                return;
            }
        }
        System.out.println("Contact Not Found!");
    }
}
