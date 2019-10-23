package app;

/**
 * HealthyBurger
 */
public class HealthyBurger extends Hamburger {
    double egg = 5.43;
    double lentils = 3.41;

    public HealthyBurger(String name, String rollType, String meat, double price) {
        super(name, rollType, meat, price);
    }
}
