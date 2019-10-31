package app;

/**
 * HealthyBurger
 */
public class HealthyBurger extends BasicBurger {

    public HealthyBurger() {
        super("Healthy Burger", 5.67, 6);
        toppingOfBurger.add(new Topping("Egg", 5.43));
        toppingOfBurger.add(new Topping("Lentils", 3.14));
    }
}
