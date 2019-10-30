package app;

/**
 * Ingredient
 */
public class Ingredient {

    String name;
    double price;
    boolean isAllowed;

    public Ingredient() {
        this.name = "";
        this.price = 0;
        this.isAllowed = false;
    }

    public Ingredient(String name, double price, boolean isAllowed) {
        this.name = name;
        this.price = price;
        this.isAllowed = isAllowed;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getIsAllowed() {
        return this.isAllowed;
    }

    @Override
    public String toString() {
        return "\n\t\t" + this.name + " : $" + String.format("%.2f", this.price);
    }
}
