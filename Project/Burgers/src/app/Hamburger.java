package app;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hamburger
 */
public class Hamburger {
    Scanner input = new Scanner(System.in);

    String name = "";
    String rollType = "";
    double price = 0;
    String meat = "";
    ArrayList<String> additionalItems = new ArrayList<String>();

    public Hamburger(String name, String rollType, double price) {
        this.name = name;
        this.rollType = rollType;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public String rollType() {
        return this.rollType;
    }

    public String getMeat() {
        return this.meat;
    }

    public void selectBread() {
        System.out.println("\nEnter the bread type : \n1.White Roll\n2.Brown Rye Roll");
        System.out.print("Select : ");
        int rollType = input.nextInt();

        switch (rollType) {
        case 1:
            this.rollType = "White Roll";
            break;
        case 2:
            this.rollType = "Brown Rye Roll";
            break;
        default:
            break;
        }
    }

    public void selectMeat() {
        System.out.println("\nEnter the Meat type : \n1.Sausage\n2.Bacon\n3.Sausage and Bacon");
        int rollType = input.nextInt();

        switch (rollType) {
        case 1:
            this.meat = "Sausage";
            break;
        case 2:
            this.meat = "Bacon";
            break;
        case 3:
            this.meat = "Sausage and Bacon";
            break;
        default:
            break;
        }
    }
}

/*
 * Each one of these items gets charged an additional price so you need some way
 * to track how many items got added and to calculate the final price (base
 * burger with all the additions). This burger has a base price and the
 * additions are all separately priced (up to 4 additions, see above).
 */
