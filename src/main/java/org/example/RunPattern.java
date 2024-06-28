package org.example;

import java.sql.SQLOutput;
import java.sql.SQLSyntaxErrorException;

public class RunPattern {
    public static void main(String[] args) {
        System.out.println("Example showing use of Memento Pattern");
        System.out.println("---- ---- ---- ---- ----");
        System.out.println("Creating an Address Book..");
        AddressBook addressBook = new AddressBook();
        System.out.println("Adding Contacts to Address Book..");
        addressBook.addContact(new ContactImpl("Peter", "Taggart", "Commander", "NSEA Protector", new AddressImpl()));
        addressBook.addContact(new ContactImpl("Tawny", "Madison", "Lieutenant", "NSEA Protector", new AddressImpl()));
        addressBook.addContact(new ContactImpl("Dr.", "Lazarus", "Doctor", "NSEA Protector", new AddressImpl()));
        addressBook.addContact(new ContactImpl("Tech. Sargent", "Chen", "Tech. Sargent", "NSEA Protector", new AddressImpl()));
        System.out.println("Current Contact List..");
        System.out.println(addressBook);
        System.out.println("---- ---- ---- ---- ----");
        System.out.println("Creating an Address Book Memento..");
        Object memeto = addressBook.getMemento();
        System.out.println();
        System.out.println("Removing old Contacts and adding new Contacts to Address Book..");
        addressBook.removeAllContacts();
        addressBook.addContact(new ContactImpl("Jason", "Nesmith", "", "Actor's Guild", new AddressImpl()));
        addressBook.addContact(new ContactImpl("Gwen", "DeMarco", "", "Actor's Guild", new AddressImpl()));
        addressBook.addContact(new ContactImpl("Alexander", "Dane", "", "Actor's Guild", new AddressImpl()));
        addressBook.addContact(new ContactImpl("Fred", "Kwan", "", "Actor's Guild", new AddressImpl()));
        System.out.println("Updated Contact List..");
        System.out.println(addressBook);
        System.out.println("---- ---- ---- ---- ----");
        System.out.println("Using Memento to restore old Contacts..");
        addressBook.setMemento(memeto);
        System.out.println("Restored Contact List..");
        System.out.println(addressBook);
        System.out.println("---- ---- ---- ---- ----");
    }
}