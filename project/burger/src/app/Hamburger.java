package app;

public class Hamburger {
    private String name;
    private double cost;
    private int maxToppings;

    public double getBurgerCost() {
        return this.cost;
    }

    public String getBurgerName() {
        return this.name;
    }

    public int getMaxToppings() {
        return this.maxToppings;
    }

    public Hamburger(String name, double cost, int maxToppings) {
        this.name = name;
        this.cost = cost;
        this.maxToppings = maxToppings;
    }

    public Hamburger() {
        this.name = "";
        this.cost = 0;
        this.maxToppings = 0;
    }

    @Override
    public String toString() {
        return "\n\t\t" + this.name + " :- \n\t\t\t Cost: $" + String.format("%.2f", this.cost)
                + " \n\t\t\t Maximum toppings: " + this.maxToppings;
    }
}
