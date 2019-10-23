package app;

import java.util.Scanner;

public class App {
    private static Scanner input;

    public static void main(String[] args) throws Exception {
        input = new Scanner(System.in);
        System.out.println("Hello Java");

        BasicBurger basic = new BasicBurger("Basic Hamburger", "White Roll", 3.56);
        HealthyBurger healthy = new HealthyBurger("Healthy Hamburger", "Brown Rye Roll", 5.67);
        DeluxeHamburger deluxe = new DeluxeHamburger("Deluxe Hamburger", "White Roll", 14.54);

        System.out.println("Enter the type of burger: \n1.Simple burger\n2.Healthy Burger\n3.Deluxe");
        System.out.print("Select : ");
        int burgerType = input.nextInt();

        switch (burgerType) {
        case 1:
            System.out.println("\n" + basic.name);
            basic.selectBread();
            basic.selectMeat();
            System.out.printf("\n%s on a %s with %s, price is %s", basic.name, basic.rollType, basic.meat, basic.price);
            basic.addAdditionals();
            for (String i : basic.additionalItems) {
                System.out.println(i);
            }
            System.out.println(basic.price);
            break;
        case 2:
            System.out.println("\n" + healthy.name);
            healthy.selectBread();
            healthy.selectMeat();
            System.out.printf("\n%s on a %s with %s, price is %s", healthy.name, healthy.rollType, healthy.meat,
                    healthy.price);
            // healthy.addAdditionals();
            // for (String i : healthy.additionalItems) {
            // System.out.println(i);
            // }
            break;
        case 3:
            System.out.println("\n" + deluxe.name);
            deluxe.selectBread();
            deluxe.selectMeat();
            System.out.printf("\n%s on a %s with %s, price is %s", deluxe.name, deluxe.rollType, deluxe.meat,
                    deluxe.price);
            // deluxe.addAdditionals();
            // for (String i : deluxe.additionalItems) {
            // System.out.println(i);
            // }
            break;
        default:
            break;
        }
    }
}
