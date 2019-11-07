package app;

/**
*/

public class BasicBurger extends Burger {
    public BasicBurger() {
        super("Basic Burger", 3.56, "White roll", 4);

        setToppingOfBurger(new Topping("Tomato", 0.27));
        setToppingOfBurger(new Topping("Lettuce", 0.72));
        setToppingOfBurger(new Topping("Cheese", 1.13));
        setToppingOfBurger(new Topping("Carrot", 2.75));
    }

    public BasicBurger(String name, double price, String rollType, int maxTopping) {
        super(name, price, rollType, maxTopping);
        setToppingOfBurger(new Topping("Tomato", 0.27));
        setToppingOfBurger(new Topping("Lettuce", 0.72));
        setToppingOfBurger(new Topping("Cheese", 1.13));
        setToppingOfBurger(new Topping("Carrot", 2.75));
    }
}
