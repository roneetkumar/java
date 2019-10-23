package app;

/**
 * DeluxeHamburger
 */
public class DeluxeHamburger extends Hamburger {

    double chips = 2.75;
    double drinks = 1.81;

    public DeluxeHamburger(String name, String rollType, String meat, double price) {
        super(name, rollType, meat, price);
    }
}
