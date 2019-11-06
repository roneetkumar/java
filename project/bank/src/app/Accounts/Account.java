package app.Accounts;

import app.BankSystem;

/**
 * Account
 */
public class Account {
    private String accountNumber;
    private double balance;
    private String accountType;

    public Account(String accountType) {
        this.accountType = accountType;
        this.accountNumber = BankSystem.generateRandomString(7);
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return the accountType
     */
    public String getAccountType() {
        return accountType;
    }

    // public boolean deposite(double amount) {

    // this.balance += amount;

    // }

    @Override
    public String toString() {
        return this.accountType;
    }
}
