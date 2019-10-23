
package app;

/**
 */

public class BasicBurger extends Hamburger {
    double lettuce = 0.75;
    double tomato = 0.27;
    double cheese = 1.13;
    double onions = 1.73;

    public BasicBurger(String name, String rollType, String meat, double price) {
        super(name, rollType, meat, price);
    }

    public void addAdditionals() {
        String again;
        do {
            System.out.println("Select items you want to add :\n1.Onions\n2.Tomato\n3.Cheese\n4.Lettuce");
            int item = input.nextInt();
            switch (item) {
            case 1:
                this.additionalItems.add("Onions");
                this.price += this.onions;
                break;
            case 2:
                this.additionalItems.add("Tomato");
                this.price += this.tomato;
                break;
            case 3:
                this.additionalItems.add("Cheese");
                this.price += this.cheese;
                break;
            case 4:
                this.additionalItems.add("Lettuce");
                this.price += this.lettuce;
                break;
            default:
                break;
            }
            do {
                System.out.print("Want to add More: ");
                again = input.next();
            } while (!again.equalsIgnoreCase("Y") && !again.equalsIgnoreCase("N"));
        } while (again.equalsIgnoreCase("Y"));
    }

}
