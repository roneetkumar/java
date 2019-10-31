package app;

/**
*/

public class BasicBurger extends Burger {
    public BasicBurger() {
        super("Basic Burger", 3.56, 4);
        toppingOfBurger.add(new Topping("Tomato", 0.27));
        toppingOfBurger.add(new Topping("Lettuce", 0.72));
        toppingOfBurger.add(new Topping("Cheese", 1.13));
        toppingOfBurger.add(new Topping("Carrot", 2.75));
    }

    public BasicBurger(String name, double price, int maxTopping) {
        super(name, price, maxTopping);
        toppingOfBurger.add(new Topping("Tomato", 0.27));
        toppingOfBurger.add(new Topping("Lettuce", 0.72));
        toppingOfBurger.add(new Topping("Cheese", 1.13));
        toppingOfBurger.add(new Topping("Carrot", 2.75));
    }
}
