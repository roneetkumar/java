package app;

/**
 * DeluxeBurger
 */
public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe Burger", 14.54, "White roll", 2);
        setToppingOfBurger(new Topping("Chips", 2.75));
        setToppingOfBurger(new Topping("Drink", 1.81));
    }
}
