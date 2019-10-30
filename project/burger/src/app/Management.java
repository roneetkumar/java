package app;

import app.Hamburger;
import app.Ingredient;
// import app.Ingredients.*;
import app.Burgers.*;
import java.util.ArrayList;
import java.util.Scanner;

/*Management*/

public class Management {

    public static Scanner input = new Scanner(System.in);

    private ArrayList<Hamburger> allBurgers = new ArrayList<Hamburger>();
    private ArrayList<Ingredient> allIngredients = new ArrayList<Ingredient>();

    public ArrayList<Hamburger> getBurgers() {
        return this.allBurgers;
    }

    public ArrayList<Ingredient> getIngredients() {
        return this.allIngredients;
    }

    Management() {
        allBurgers.add(new BasicBurger());
        allBurgers.add(new HealthyBurger());
        allBurgers.add(new DeluxeBurger());
        allIngredients.add(new Ingredient("Lettuce", 0.75, false));
        allIngredients.add(new Ingredient("Tomato", 0.27, false));
        allIngredients.add(new Ingredient("Cheese", 1.13, false));
        allIngredients.add(new Ingredient("Egg", 5.43, false));
        allIngredients.add(new Ingredient("Lentils", 3.14, false));
        allIngredients.add(new Ingredient("Chips", 2.75, false));
        allIngredients.add(new Ingredient("Drinks", 1.81, false));

    }

    public static void displayBurgerOptions() {
        System.out.println("\n\tAll Burgers : ");

        for (Hamburger currentBurger : new Management().getBurgers()) {
            System.out.println(currentBurger.toString());
        }
        App.displayMenu();
    }

    public static void displayIngredients() {
        System.out.println("\n\tAll Ingredients : ");
        for (Ingredient currentIngredient : new Management().getIngredients()) {
            System.out.println(currentIngredient.toString());
        }
        App.displayMenu();
    }

    public static void buildBurger() {
        System.out.println("building");
    }

    // public static void recordBurgerChoice(int selectedBurger) {
    // Hamburger burgerSelection = new Hamburger();
    // switch (selectedBurger) {
    // case 1:
    // burgerSelection = new BasicBurger();
    // break;
    // case 2:
    // burgerSelection = new HealthyBurger();
    // break;
    // case 3:
    // burgerSelection = new DeluxeBurger();
    // break;
    // default:
    // System.out.println("\n \t\t Invalid option, please try again \n");
    // break;
    // }
    // }
}
