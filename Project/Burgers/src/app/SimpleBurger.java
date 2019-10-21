
package app;

/**
 */

public class SimpleBurger extends Hamburger {
    double meat = 2;
    double lettuce = 0.75;
    double tomato = 0.27;
    double cheese = 1.13;

    public SimpleBurger(String name, String rollType, double price) {
        super(name, rollType, price);
    }
}
