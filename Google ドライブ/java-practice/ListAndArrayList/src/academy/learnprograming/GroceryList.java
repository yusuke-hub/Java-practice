//package academy.learnprograming;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class GroceryList {
//    private static ArrayList<String> groceryList = new ArrayList<String>();
//
//    public void addGroceryItem(String item) {
//        groceryList.add(item);
//    }
//
//    public void printGroceryList() {
//        System.out.println("You have " + groceryList.size() + " items in your grocery list");
//        for(int i=0; i< groceryList.size(); i++) {
//            System.out.println((i+1) + ". " + groceryList.get(i));
//        }
//    }
//
//    public void modifyGrocetyItem(String currentItem, String newItem) {
//        int position = findItem(currentItem);
//        if(position >= 0) {
//            modifyGroeryItem(position, newItem);
//        }
//    }
//
//    private void modifyGroeryItem(int position, String newItem) {
//        groceryList.set(position, newItem);
//        System.out.println("Grocery item " + (position+1) + " has been modified.");
//    }
//
//    public void removeGroceryItem(String item) {
//        int position = findItem(item);
//        if(position >= 0) {
//            removeGroceryItem(position);
//        }
//    }
//    private void removeGroceryItem(int position) {
//        String theItem = groceryList.get(position);
//        groceryList.remove(position);
//
//    }
//
//    private int findItem(String searchItem) {
//        return groceryList.indexOf(searchItem);
//    }
//
//    public boolean onFile(String searchItem) {
//        int position = findItem(searchItem);
//        if(position >=0) {
//            return true;
//        }
//        return false;
//    }
//
//    public static void processArrayList() {
//        ArrayList<String> newArray = new ArrayList<String>();
//        newArray.addAll(groceryList.getGroceryList());
//        ArrayList<Strig> nextArray = new ArrayList<String>(groceryList.getGroceryList());
//
//        String[] myArray = new String(groceryList.getGroceryList().size());
//        myArray = groceryList.getGroceryList().toArray(myArray);
//    }
//}

package academy.learnprograming;q

import java.util.ArrayList;

/**
 * Created by dev on 23/08/15.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {

        groceryList.add(item);
    }


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }

    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }

        return false;
    }
}

