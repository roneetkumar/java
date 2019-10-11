package app;

/**
 * Hamburger
 */
public class Hamburger {
    String name = "";
    String rollType = "";
    double price = 0;
    double meat = 2;
    double lettuce = 0.75;
    double tomato = 0.27;
    double cheese = 1.13;

    public Hamburger(String name, String rollType, double price) {
        this.name = name;
        this.rollType = rollType;
        this.price = price;
    }

    public void calculateTotal() {

    }

}

/*
 * Each one of these items gets charged an additional price so you need some way
 * to track how many items got added and to calculate the final price (base
 * burger with all the additions). This burger has a base price and the
 * additions are all separately priced (up to 4 additions, see above).
 */
