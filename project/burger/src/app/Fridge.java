package app;

import java.util.ArrayList;

/**
 * Store
 */
public class Fridge {

    private ArrayList<Burger> allBurgers = new ArrayList<Burger>();
    private ArrayList<Topping> allToppings = new ArrayList<Topping>();

    private BasicBurger basicBurger = new BasicBurger();
    private HealthyBurger healthyBurger = new HealthyBurger();
    private DeluxeBurger deluxeBurger = new DeluxeBurger();

    public ArrayList<Burger> getBurgers() {
        return this.allBurgers;
    }

    public ArrayList<Topping> getToppings() {
        return this.allToppings;
    }

    public Fridge() {
        allBurgers.add(basicBurger);
        allBurgers.add(healthyBurger);
        allBurgers.add(deluxeBurger);
        this.allToppings.addAll(basicBurger.getToppingsOfBurger());
        this.allToppings.addAll(healthyBurger.getToppingsOfBurger());
        this.allToppings.addAll(deluxeBurger.getToppingsOfBurger());
    }
}
