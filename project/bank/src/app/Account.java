package app;

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

    public boolean setBalance(double balance) {

        if (balance > 0) {
            this.balance += balance;
            return true;
        } else {
            return false;
        }

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

    @Override
    public String toString() {
        return this.accountType;
    }
}
