package app;

import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        System.out.println("\n\tPlease select an option");
        System.out.println("\t1. See burger types");
        System.out.println("\t2. See burger toppings");
        System.out.println("\t3. Build a burger");
        System.out.print("\n\tSelected:  ");
        userInput(input.nextInt());
    }

    public static void userInput(Integer userSelection) {
        switch (userSelection) {
        case 1:
            Management.displayBurgerOptions();
            break;
        case 2:
            Management.displayIngredients();
            break;
        case 3:
            Management.buildBurger();
            break;
        default:
            System.out.println("\n \t\t Invalid option, please try again \n");
            displayMenu();
            break;
        }
    }
}
