package app;

import java.util.Scanner;

/**
 * Management
 */
public class Management {

    public static Scanner input;

    private static Fridge fridge = new Fridge();
    private static Bill reciept = new Bill();
    private static Burger burger = new Burger();

    public static void displayMenu() {
        System.out.println("\nPlease select an option:");
        System.out.println("````````````````````````");
        System.out.println("1. See burger types");
        System.out.println("2. See burger toppings");
        System.out.println("3. Build a burger");
        System.out.print("\nSelect:  ");
        try {
            input = new Scanner(System.in);
            userInput(input.nextInt());
        } catch (Exception e) {
            Error();
            displayMenu();
        }
    }

    public static void userInput(int userSelection) {
        switch (userSelection) {
        case 1:
            Management.displayBurger();
            break;
        case 2:
            Management.displayIngredients();
            break;
        case 3:
            Management.createBurger();
            break;
        default:
            Error();
            displayMenu();
            break;
        }
    }

    public static void displayBurger() {
        System.out.println("\nAll Burgers :");
        System.out.println("`````````````");

        for (Burger burger : fridge.getBurgers()) {
            System.out.println(burger);
        }
        displayMenu();
    }

    public static void displayIngredients() {
        System.out.println("\nAll Toppings : ");
        System.out.println("```````````````");
        int tmpCounter = 1;

        for (Topping topping : fridge.getToppings()) {
            System.out.print(tmpCounter + ". " + topping);
            tmpCounter++;
        }
        displayMenu();
    }

    public static void createBurger() {
        displayBurgerChoice();
        displayToppingChoice();
    }

    public static void displayBurgerChoice() {
        int tmpCounter = 1;
        System.out.println("\nPlease select a burger:");
        System.out.println("```````````````````````");
        for (Burger burger : fridge.getBurgers()) {
            System.out.print(tmpCounter + ". " + burger.getBurgerName() + "\n");
            tmpCounter++;
        }
        System.out.print("\nSelect: ");

        try {
            input = new Scanner(System.in);
            storeBurgerChoice(input.nextInt());
        } catch (Exception e) {
            Error();
            displayBurgerChoice();
        }
    }

    public static void displayToppingChoice() {
        Integer tmpCounter = 1;
        int toppingCount = burger.getMaxTopping();
        System.out.println("\nPlease select any " + toppingCount + " toppings:");
        System.out.println("`````````````````````````````");

        for (Topping topping : burger.toppingOfBurger) {
            System.out.print(tmpCounter + ". " + topping);
            tmpCounter++;
        }

        System.out.print("0. Thats all ");
        System.out.print("\n\nSelect: ");

        try {
            input = new Scanner(System.in);
            storeToppingChoice(input.nextInt());
        } catch (Exception e) {
            Error();
            displayToppingChoice();
        }
    }

    public static void storeBurgerChoice(int selectedBurger) throws Exception {
        switch (selectedBurger) {
        case 1:
            burger = new BasicBurger();
            break;
        case 2:
            burger = new HealthyBurger();
            break;
        case 3:
            burger = new DeluxeBurger();
            break;
        default:
            Error();
            displayBurgerChoice();
            break;
        }
        try {
            reciept.setBurgerChoice(burger);
        } catch (Exception ex) {
            throw new Exception("this burger is not available");
        }
    }

    public static void storeToppingChoice(int selectedTopping) {
        switch (selectedTopping) {
        case 1:
            reciept.addTopping(burger.toppingOfBurger.get(0));
            break;
        case 2:
            reciept.addTopping(burger.toppingOfBurger.get(1));
            break;
        case 3:
            reciept.addTopping(burger.toppingOfBurger.get(2));
            break;
        case 4:
            reciept.addTopping(burger.toppingOfBurger.get(3));
            break;
        case 5:
            reciept.addTopping(burger.toppingOfBurger.get(3));
            break;
        case 6:
            reciept.addTopping(burger.toppingOfBurger.get(3));
            break;
        case 0:
            reciept.generateReciept();
            break;
        default:
            System.out.println("\nPlease select the right topping");
            displayToppingChoice();
            break;
        }
    }

    public static void Error() {
        System.out.println("\nInvalid option, please try again");
    }

}
