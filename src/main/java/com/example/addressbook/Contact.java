package com.example.addressbook;

import java.util.Objects;

public class Contact {
    private String firstName, lastName, address, city, state, email;
    private String phoneNumber;
    private int zip;

    public Contact(String firstName, String lastName, String address, String city,
                   String state, int zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | " + address + ", " + city + ", " + state +
               " - " + zip + " | " + phoneNumber + " | " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact c = (Contact) o;
        return firstName.equalsIgnoreCase(c.firstName) && lastName.equalsIgnoreCase(c.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }
}

