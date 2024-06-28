package org.example;

public class ContactImpl implements Contact {
    private String firstName;
    private String lastName;
    private String title;
    private String organization;
    private Address address;

    public ContactImpl() {}
    public ContactImpl(String firstName, String lastName, String title, String organization, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.organization = organization;
        this.address = address;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getOrganization() {
        return organization;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}