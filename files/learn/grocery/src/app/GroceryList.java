package app;

import java.util.ArrayList;

/**
 * GroceryList
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        this.groceryList.add(item);
    }

    private void removeGroceryItem(int position) {
        String item = this.groceryList.get(position);
        this.groceryList.remove(position);
        System.out.println(item + " is removed");
    }

    public void removeGroceryItem(String item) {
        int pos = findItem(item);
        if (pos >= 0) {
            removeGroceryItem(pos);
        }
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    private void modifyGroceryList(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void modifyGroceryList(String currItem, String newItem) {
        int pos = findItem(currItem);
        if (pos >= 0) {
            modifyGroceryList(pos, newItem);
        }
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String item) {
        int pos = findItem(item);
        if (pos >= 0) {
            return true;
        }
        return false;
    }

}
