package app;

import java.util.ArrayList;

/**
 * Burger
 */
public class Burger {
    private String name;
    private double price;
    private int maxTopping;
    protected ArrayList<Topping> toppingOfBurger = new ArrayList<Topping>();

    public Burger(String name, double price, int maxTopping) {
        this.name = name;
        this.price = price;
        this.maxTopping = maxTopping;
    }

    public Burger() {
        this.name = "";
        this.price = 0;
        this.maxTopping = 0;
    }

    public String getBurgerName() {
        return this.name;
    }

    public double getBurgerPrice() {
        return this.price;
    }

    public int getMaxTopping() {
        return this.maxTopping;
    }

    public ArrayList<Topping> getToppingsOfBurger() {
        return this.toppingOfBurger;
    }

    @Override
    public String toString() {
        return this.name + " :- \n\t Cost: $" + String.format("%.2f", this.price) + "\n\t Maximum toppings: "
                + this.maxTopping + "\n";
    }

}
