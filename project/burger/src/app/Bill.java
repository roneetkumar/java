package app;

import java.util.ArrayList;

/**
 * Bill
 */
public class Bill {
    Burger burger;
    ArrayList<Topping> allToppings = new ArrayList<Topping>();

    public void setBurgerChoice(Burger burger) {
        this.burger = burger;
    }

    public void addTopping(Topping topping) {
        this.allToppings.add(topping);

        if (this.burger.getMaxTopping() == allToppings.size()) {
            generateReciept();
        } else {
            Management.displayToppingChoice();
        }
    }

    public double calcTotal() {
        double tmpRunningTotal = 0;
        tmpRunningTotal += burger.getBurgerPrice();
        for (Topping topping : allToppings) {
            tmpRunningTotal += topping.getPrice();
        }
        return tmpRunningTotal;
    }

    public void generateReciept() {
        double total = calcTotal();
        double tax = calcTotal() * 0.15;
        double netTotal = calcTotal() + tax;

        System.out.println("\n\tReciept");
        System.out.println("\t```````");
        System.out.println("1. " + burger.getBurgerName() + " - " + burger.getBurgerPrice());
        if (allToppings.size() > 0) {
            int counter = 1;
            System.out.println("\nExtras : ");
            System.out.println("````````");

            for (Topping topping : allToppings) {
                System.out.print(counter + ". " + topping);
                counter++;
            }
        } else {
            System.out.println("\nNo extras toppings");

        }

        System.out.println("\n-----------------------------");
        System.out.print("Amount: " + String.format("%.2f", total) + "$");
        System.out.print(" + (Tax: " + String.format("%.2f", tax) + "$)");
        System.out.println("\n-----------------------------");
        System.out.println("Total: " + String.format("%.2f", netTotal) + "$");
        System.out.println("-----------------------------");
    }
}
