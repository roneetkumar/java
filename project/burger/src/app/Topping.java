package app;

/**
 * Ingredient
 */
public class Topping {

    String name;
    double price;

    public Topping() {
        this.name = "";
        this.price = 0;
    }

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name + " : $" + String.format("%.2f", this.price) + "\n";
    }
}
