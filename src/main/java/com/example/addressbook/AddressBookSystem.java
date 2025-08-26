package com.example.addressbook;

import java.util.*;

public class AddressBookSystem {
    private Map<String, AddressBook> addressBooks = new HashMap<>();

    public void addAddressBook(String name) {
        addressBooks.putIfAbsent(name, new AddressBook(name));
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }
    
    public List<Contact> searchPersonInCityOrState(String key) {
        return addressBooks.values().stream()
                .flatMap(ab -> ab.getContacts().stream())
                .filter(c -> c.getCity().equalsIgnoreCase(key) || c.getState().equalsIgnoreCase(key))
                .toList();
    }

}

