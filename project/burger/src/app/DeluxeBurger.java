package app;

/**
 * DeluxeBurger
 */
public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe Burger", 14.54, 2);
        toppingOfBurger.add(new Topping("Chips", 2.75));
        toppingOfBurger.add(new Topping("Drink", 1.81));
    }
}
