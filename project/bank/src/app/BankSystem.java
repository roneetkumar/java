package app;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import app.Accounts.*;

/**
 * BankSystem
 */
public class BankSystem {

    private String bankName = "Scocia Bank";
    public static Scanner input;
    public static ArrayList<User> allUsers = new ArrayList<User>();

    /**
     * @return the bankName
     */
    public void getBankName() {
        System.out.println("\t" + this.bankName);
        System.out.println("\t```````````");
    }

    public void displayMenu() {
        System.out.println("\t  Options");
        System.out.println("\t  ```````");
        System.out.println("1. Create Account");
        System.out.println("2. Login");
        System.out.println("0. Exit");

        System.out.print("Select the option from Menu : ");

        try {
            input = new Scanner(System.in);
            selectMenuOption(input.nextInt());
        } catch (Exception e) {
            generateError("\nNOTE: only integers are allowed to navigate option\n");
            displayMenu();
        }

    }

    public void selectMenuOption(int choice) {
        if (choice == 1) {
            createUser();
        } else if (choice == 2) {
            initLogin();
        } else {
            generateError("\nNOTE: please select the correct option\n");
            displayMenu();
        }
    }

    public void createUser() {
        System.out.println("\n\tCreate Account");
        System.out.println("\t``````````````");

        try {
            // firstname
            System.out.print("Enter your first name: ");
            String firstName = input.next();

            // lastname
            System.out.print("Enter your last name: ");
            String lastName = input.next();

            // password
            System.out.print("Enter a secure 6 digit PIN: ");
            String pin = input.next();

            // creating user
            User newUser = new User(firstName, lastName, pin);

            createAccount(newUser);
            allUsers.add(newUser);
            displayMenu();

        } catch (Exception e) {
            createUser();
        }
    }

    public void createAccount(User newUser) {
        System.out.println("\nSelect the type of account(s) you want to create :");
        System.out.println("1. Savings");
        System.out.println("2. Chequing");
        System.out.println("3. Savings And Chequing");
        System.out.println("0. Go Back");
        System.out.print("\nSelect : ");

        switch (input.nextInt()) {
        case 1:
            newUser.setAccounts(new Savings());
            break;
        case 2:
            newUser.setAccounts(new Savings());
            break;
        case 3:
            newUser.setAccounts(new Savings());
            newUser.setAccounts(new Chequing());
            break;
        case 0:
            displayMenu();
            break;
        default:
            createAccount(newUser);
            break;
        }

        System.out.println("\nCongratulations your account created sucessfuly\n");
        System.out.println("Account Info : ");
        System.out.println(newUser);
    }

    // login method
    public static void initLogin() {
        System.out.println("\n\t Login");
        System.out.println("\t `````");

        System.out.print("Enter User ID : ");
        String tempUserID = input.next();
        boolean found = false;

        for (User user : allUsers) {
            if (tempUserID.equals(user.getUserID())) {
                found = !found;
                user.login(1);
            }
        }
        if (!found) {
            generateError("No account with this User ID Exits");
        }
    }

    public static String generateRandomString(int length) {
        String tempNumber = "";
        for (int i = 0; i < length; i++) {
            tempNumber += Integer.toString(new Random().nextInt(5));
        }
        return tempNumber;
    }

    private static void generateError(String error) {
        System.out.println(error);
    }

}
