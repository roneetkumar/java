package app;

import java.util.ArrayList;

/**
 * Mobile
 */
public class Mobile {
    private String myNumber;

    private ArrayList<Contact> myContacts;

    public Mobile(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public String getMyNumber() {
        return myNumber;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already on the file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) > 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int pos = findContact(name);
        if (pos >= 0) {
            return this.myContacts.get(pos);
        }
        return null;
    }

    public boolean removeContact(Contact contact) {
        int foundPos = findContact(contact);
        if (foundPos < 0) {
            System.out.println(contact.getName() + ", was not found");
            return false;
        }
        this.myContacts.remove(foundPos);
        System.out.println(contact.getName() + ", was deleted ");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPos = findContact(oldContact);
        if (foundPos < 0) {
            System.out.println(oldContact.getName() + " not found");
            return false;
        }
        this.myContacts.set(foundPos, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public void printContact() {
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println(
                    (i + 1) + ". " + this.myContacts.get(i).getName() + "->" + this.myContacts.get(i).getPhoneNumber());
        }
    }

}
