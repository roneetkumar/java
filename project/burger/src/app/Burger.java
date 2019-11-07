package app;

import java.util.ArrayList;

/**
 * Burger
 */
public class Burger {
    private String name;
    private double price;
    private String rollType;
    private int maxTopping;
    private ArrayList<Topping> toppingOfBurger = new ArrayList<Topping>();

    public Burger(String name, double price, String rollType, int maxTopping) {
        this.name = name;
        this.price = price;
        this.rollType = rollType;
        this.maxTopping = maxTopping;
    }

    public Burger() {
        this.name = "";
        this.price = 0;
        this.rollType = "";
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

    public String getRollType() {
        return rollType;
    }

    public ArrayList<Topping> getToppingsOfBurger() {
        return this.toppingOfBurger;
    }

    public void setToppingOfBurger(Topping topping) {
        this.toppingOfBurger.add(topping);
    }

    @Override
    public String toString() {
        return this.name + " with " + this.rollType + " :- \nCost: $" + String.format("%.2f", this.price)
                + "\nMaximum toppings: " + this.maxTopping + "\n";
    }

}
