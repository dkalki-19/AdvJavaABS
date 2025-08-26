package com.example.addressbook;


import java.util.*;

public class AddressBook {
    private String name;
    private List<Contact> contacts;

    public AddressBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        if (contacts.contains(contact)) {
            System.out.println("Duplicate Contact Not Allowed");
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public String getName() { return name; }
    
    public boolean editContact(String firstName, Scanner sc) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.print("Enter new City: ");
                c.setCity(sc.nextLine());
                System.out.print("Enter new State: ");
                c.setState(sc.nextLine());
                System.out.print("Enter new Zip: ");
                c.setZip(Integer.parseInt(sc.nextLine()));
                System.out.print("Enter new Phone: ");
                c.setPhoneNumber(sc.nextLine());
                System.out.print("Enter new Email: ");
                c.setEmail(sc.nextLine());
                return true;
            }
        }
        return false;
    }
    
    public boolean deleteContact(String firstName) {
        return contacts.removeIf(c -> c.getFirstName().equalsIgnoreCase(firstName));
    }


}

