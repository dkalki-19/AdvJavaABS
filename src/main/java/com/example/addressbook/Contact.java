package com.example.addressbook;

import java.util.Objects;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private String phoneNumber;
    private int zip;

    // UC1: Create Contact – constructor + getters/setters
    public Contact(String firstName, String lastName, String address, String city,
                   String state, String email, String phoneNumber, int zip) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.address   = address;
        this.city      = city;
        this.state     = state;
        this.email     = email;
        this.phoneNumber = phoneNumber;
        this.zip         = zip;
    }

    public String getFirstName()    { return firstName; }
    public String getLastName()     { return lastName; }
    public String getAddress()      { return address; }
    public String getCity()         { return city; }
    public String getState()        { return state; }
    public String getEmail()        { return email; }
    public String getPhoneNumber()  { return phoneNumber; }
    public int getZip()             { return zip; }

    public void setAddress(String address)       { this.address = address; }
    public void setCity(String city)             { this.city = city; }
    public void setState(String state)           { this.state = state; }
    public void setEmail(String email)           { this.email = email; }
    public void setPhoneNumber(String phone)     { this.phoneNumber = phone; }
    public void setZip(int zip)                  { this.zip = zip; }

    // UC6: Avoid duplicates – identity by (firstName,lastName)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact c = (Contact) o;
        return firstName.equalsIgnoreCase(c.firstName)
            && lastName.equalsIgnoreCase(c.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }

    @Override
    public String toString() {
        return "%s %s | %s | %s | %s, %s - %d"
                .formatted(firstName, lastName, phoneNumber, email, city, state, zip);
    }
}
