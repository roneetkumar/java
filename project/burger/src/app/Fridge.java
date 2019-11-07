package app;

import java.util.ArrayList;

/**
 * Store
 */
public class Fridge {

    private ArrayList<Burger> allBurgers = new ArrayList<Burger>();
    private ArrayList<Topping> allToppings = new ArrayList<Topping>();

    public ArrayList<Burger> getBurgers() {
        return this.allBurgers;
    }

    public ArrayList<Topping> getToppings() {
        return this.allToppings;
    }

    public Fridge() {
        BasicBurger basicBurger = new BasicBurger();
        HealthyBurger healthyBurger = new HealthyBurger();
        DeluxeBurger deluxeBurger = new DeluxeBurger();

        allBurgers.add(basicBurger);
        allBurgers.add(healthyBurger);
        allBurgers.add(deluxeBurger);
        this.allToppings.addAll(healthyBurger.getToppingsOfBurger());
        this.allToppings.addAll(deluxeBurger.getToppingsOfBurger());
    }
}
