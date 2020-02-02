package app;

import java.util.ArrayList;

/**
 * User
 */
public class User {
    private String firstName;
    private String lastName;
    private String userID;
    private String pin;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public User(String firstName, String lastName, String pin) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
        this.userID = BankSystem.generateRandomString(4);
        this.pin = pin;
    }

    /**
     * @return the accounts
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
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

    public boolean authenticatePIN(String tempPIN) {
        return this.pin.equals(tempPIN);
    }

    public boolean deposite(double amount, Account selectedAccount) {

        return selectedAccount.setBalance(amount);
    }

    public boolean widthrawl(double amount, Account selectedAccount) {
        return selectedAccount.setBalance(amount);
    }

    public String toString() {
        return "Name : " + this.firstName + " " + this.lastName + "\nUser ID : --- " + this.userID
                + " --- (NOTE: Remember User ID for Login)\nAccounts: " + this.accounts + "\n";
    }

}
