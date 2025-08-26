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
}

