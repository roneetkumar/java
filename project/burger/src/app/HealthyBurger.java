package app;

/**
 * HealthyBurger
 */
public class HealthyBurger extends BasicBurger {

    public HealthyBurger() {
        super("Healthy Burger", 5.67, "Brown rye roll", 6);
        setToppingOfBurger(new Topping("Egg", 5.43));
        setToppingOfBurger(new Topping("Lentils", 3.14));
    }
}
