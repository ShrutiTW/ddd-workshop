package main.java.com.ecom;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> itemList = new ArrayList<>();
    private List<Product> deletedProducts = new ArrayList<>();

    public void addItem(Item itemToAdd) {
        System.out.println("\nAdding " + itemToAdd + " to the cart: \n");
        itemList.add(itemToAdd);
        displayItems();

    }

    private void displayItems() {
        System.out.println("Items in the cart are: \n");
        for (Item items : itemList) {
            System.out.println("Item " + items + " is in cart");
        }
    }


    public void removeItem(Item itemToRemove) {
        System.out.println("\nRemoving " + itemToRemove + " from the cart: \n");
        itemList.remove(itemToRemove);
        deletedProducts.add(itemToRemove.getProduct());
        displayItems();

    }

    public List<Product> fetchDeletedProducts() {
        return deletedProducts;
    }

}
