package app;

import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);
    private static Mobile mobile = new Mobile("438 979 3111");

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        boolean quit = false;
        startPhone();
        printActions();

        while (!quit) {
            System.out.println("\nEnter action : ");
            int action = input.nextInt();
            switch (action) {
            case 0:
                System.out.println("\nShutting down...");
                quit = true;
                break;
            case 1:
                mobile.printContact();
                break;
            case 2:
                addContact();
                break;
            case 3:
                updateContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                queryContact();
                break;
            case 6:
                printActions();
                break;
            default:
                break;
            }
        }

    }

    private static void startPhone() {
        System.out.println("Starting Phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0. Shutdown\n" + "1. Print\n" + "2. Add\n" + "3. Update\n" + "4. Remove\n" + "5. Query\n"
                + "6. Actions");
        System.out.println("Choose your action: ");
    }

    private static void addContact() {
        System.out.println("Enter new Contact : ");
        String name = input.next();
        System.out.println("Enter new number : ");
        String phoneNumber = input.next();

        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobile.addNewContact(newContact)) {
            System.out.println("New Contact added name: " + name + ", phone: " + phoneNumber);
        } else {
            System.out.println("cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.print("Enter existing contact name: ");
        String name = input.next();

        Contact existingContact = mobile.queryContact(name);

        if (existingContact == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.print("Enter new contact name : ");
        String newName = input.next();

        System.out.print("Enter new phone number : ");
        String newNumber = input.next();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobile.updateContact(existingContact, newContact)) {
            System.out.println("Sucessfully updated record");
        } else {
            System.out.println("Error while updating record");
        }

    }

    private static void removeContact() {
        System.out.print("Enter existing contact name: ");
        String name = input.next();

        Contact existingContact = mobile.queryContact(name);

        if (existingContact == null) {
            System.out.println("contact not found");
            return;
        }

        if (mobile.removeContact(existingContact)) {
            System.out.println("Sucessfully deleted record");
        } else {
            System.out.println("Error while deleting record");
        }

    }

    private static void queryContact() {
        System.out.print("Enter existing contact name: ");
        String name = input.next();

        Contact existingContact = mobile.queryContact(name);

        if (existingContact == null) {
            System.out.println("contact not found");
            return;
        }

        System.out.println("Name: " + existingContact.getName() + ", Phone: " + existingContact.getPhoneNumber());

        if (mobile.removeContact(existingContact)) {
            System.out.println("Sucessfully deleted record");
        } else {
            System.out.println("Error while deleting record");
        }

    }

}
