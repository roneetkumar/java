package app;

import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        boolean quit = false;
        int choice = 0;
        printInstruction();

        while (!quit) {
            System.out.print("Enter your choice : ");
            choice = input.nextInt();

            switch (choice) {
            case 0:
                printInstruction();
                break;
            case 1:
                groceryList.printGroceryList();
                break;
            case 2:
                addItem();
                break;
            case 3:
                modifyItem();
                break;
            case 4:
                removeItem();
                break;
            case 5:
                searchItem();
                break;
            case 6:
                quit = true;
                break;
            default:
                break;
            }
        }
    }

    public static void printInstruction() {
        System.out.println("\nPress ");
        System.out.println("\t0. Print Options ");
        System.out.println("\t1. Print List");
        System.out.println("\t2. Add Item ");
        System.out.println("\t3. Modify Item");
        System.out.println("\t4. Remove Item");
        System.out.println("\t5. Search Item");
        System.out.println("\t6. Quit");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item : ");
        groceryList.addGroceryItem(input.next());
    }

    public static void modifyItem() {
        System.out.print("Enter old item  : ");
        String item = input.next();
        input.nextLine();
        System.out.println("Enter new item : ");
        String newItem = input.nextLine();
        groceryList.modifyGroceryList(item, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item : ");
        String item = input.next();
        groceryList.removeGroceryItem(item);
    }

    public static void searchItem() {
        System.out.print("Enter item to search for : ");
        String item = input.next();
        if (groceryList.onFile(item)) {
            System.out.println("Found " + item + " in list");
        } else {
            System.out.println(item + "not found in list");
        }
    }
}
