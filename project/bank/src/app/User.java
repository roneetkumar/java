package app;

import app.Accounts.*;
import java.util.ArrayList;

/**
 * User
 */
public class User {
    private String firstName;
    private String lastName;
    private String userID;
    private String pin;
    ArrayList<Account> accounts = new ArrayList<Account>();

    public User(String firstName, String lastName, String pin) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
        this.userID = BankSystem.generateRandomString(4);
        this.pin = pin;
    }

    /**
     * @param accounts the accounts to set
     */
    public void setAccounts(Account account) {
        accounts.add(account);
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    public void login(int attempt) {
        System.out.print("Enter PIN : ");
        String tempPIN = BankSystem.input.next();

        if (tempPIN.equals(this.pin)) {

            System.out.println("\nSelect Options : ");
            int temp = 1;

            for (Account account : accounts) {
                System.out.println(temp + ". " + account);
                temp++;
            }
            System.out.println(temp + ". Settings");

        } else {
            if (attempt == 3) {
                System.out.println(
                        "\nNOTE: Sorry you have exceeded the number of allowed attempts,\nyour account has been temporary blocked, please visit the nearest branch or contact customer support.");
            } else {
                System.out.println("Entered PIN is not correct");
                attempt++;
                login(attempt);
            }
        }
    }

    public String toString() {
        return "Name : " + this.firstName + " " + this.lastName + "\nUser ID : --- " + this.userID
                + " --- (NOTE: Remember User ID for Login)\nAccounts: " + this.accounts + "\n";
    }
}
