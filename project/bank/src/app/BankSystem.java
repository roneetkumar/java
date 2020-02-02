package app;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * BankSystem
 */
public class BankSystem {

    public static Scanner input;
    public static ArrayList<User> allUsers = new ArrayList<User>();

    private static String bankName = "Scocia Bank";

    /**
     * @return the bankName
     */
    public static void getBankName() {
        System.out.println("\t" + bankName);
        System.out.println("\t```````````");
    }

    public static void displayMenu() {
        System.out.println("\t  Options");
        System.out.println("\t  ```````");
        System.out.println("1. Create Account");
        System.out.println("2. Login");
        System.out.println("0. Exit");

        System.out.print("Select the option from Menu : ");

        try {
            input = new Scanner(System.in);
            selectOption(input.nextInt());
        } catch (Exception e) {
            generateError("\nNOTE: please select the correct option\n");
            displayMenu();
        }

    }

    private static void selectOption(int select) {
        if (select == 1) {
            BankSystem.createUser();
        } else if (select == 2) {
            BankSystem.prepareLogin();
        } else {
            generateError("\nNOTE: please select the correct option\n");
            BankSystem.displayMenu();
        }
    }

    private static void createUser() {
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

    private static void createAccount(User newUser) {
        System.out.println("\nSelect the type of account(s) you want to create :");
        System.out.println("1. Savings");
        System.out.println("2. Chequing");
        System.out.println("3. Savings And Chequing");
        System.out.println("0. Go Back");
        System.out.print("\nSelect : ");

        switch (input.nextInt()) {
        case 1:
            newUser.setAccounts(new Account("Savings"));
            break;
        case 2:
            newUser.setAccounts(new Account("Chequing"));
            break;
        case 3:
            newUser.setAccounts(new Account("Savings"));
            newUser.setAccounts(new Account("Chequing"));
            break;
        case 0:
            displayMenu();
            break;
        default:
            createAccount(newUser);
            break;
        }

        System.out.println("\nCongratulations your account(s) has been created sucessfuly\n");
        System.out.println("Account Info : ");
        System.out.println(newUser);
    }

    // login method
    private static void prepareLogin() {
        System.out.println("\n\t Login");
        System.out.println("\t `````");

        User foundUser = findUser(readString("Enter User ID : "));
        int maxAttempts = 3;
        if (foundUser != null) {
            if (checkPassword(foundUser, maxAttempts)) {
                initiateLogin(foundUser);
            } else {
                generateError(
                        "\nNOTE: Sorry you have exceeded the number of allowed attempts,\nyour account has been temporary blocked, please visit the nearest branch or contact customer support.");
            }
        } else {
            generateError("No account with this User ID Exits");
            prepareLogin();
        }
    }

    private static void initiateLogin(User foundUser) {

        System.out.println("\n\nWelcome to Scotia Online Banking");
        System.out.println("````````````````````````````````");

        System.out.println("User ID : " + foundUser.getUserID());
        System.out.println("Full Name : " + foundUser.getFirstName() + " " + foundUser.getLastName());
        System.out.println("\nAccounts: ");
        int temp = 1;

        for (Account account : foundUser.getAccounts()) {
            System.out.println(temp + ". " + account);
            temp++;
        }
        System.out.println(temp + ". Settings");
        System.out.println("0. Log Out");
        System.out.print("\nSelect : ");

        selectAccountOptions(foundUser);

    }

    private static void selectAccountOptions(User foundUser) {
        try {
            input = new Scanner(System.in);
            int select = input.nextInt();

            if (select == 0) {
                return;
            } else if (select >= 1 && select < 3) {
                Account selectedAccount = foundUser.getAccounts().get(select - 1);
                operateAccount(selectedAccount);
            } else {
                generateError("\nNOTE: please select the correct option\n");
                selectAccountOptions(foundUser);
            }
        } catch (Exception e) {
            generateError("\nNOTE: please select the correct option\n");
            selectAccountOptions(foundUser);
        }
    }

    private static void displayAccountMenu() {
        System.out.println("1. Deposite");
        System.out.println("2. Withdrawl");
        System.out.println("3. Transfer");
        System.out.println("0. LogOut");
        System.out.println("Select : ");

    }

    private static void selectAccountMenuOption() {

        try {
            input = new Scanner(System.in);
            int select = input.nextInt();

            if (select == 1) {
                System.out.println("Enter how much you want to deposite : ");
                select = input.nextInt();

            }

        } catch (Exception e) {
            generateError("\nNOTE: please select the correct option\n");
            displayAccountMenu();
        }
    }

    private static void operateAccount(Account seletedAccount) {
        displayAccountMenu();
        selectAccountMenuOption();
        return;
    }

    private static boolean checkPassword(User foundUser, int attempt) {
        if (attempt != 0) {
            if (foundUser.authenticatePIN(readString("Enter PIN : "))) {
                return true;
            } else {
                System.out.println("Entered PIN is not correct");
                checkPassword(foundUser, --attempt);
            }
        }
        return false;
    }

    private static String readString(String line) {
        System.out.print(line);
        String tempStr = "";
        try {
            tempStr = input.next();
        } catch (Exception e) {
            readString(line);
        }
        return tempStr;
    }

    private static User findUser(String tempUserID) {
        for (User user : allUsers) {
            if (tempUserID.equals(user.getUserID())) {
                return user;
            }
        }
        return null;
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
