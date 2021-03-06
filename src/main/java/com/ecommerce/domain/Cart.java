package main.java.com.ecommerce.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Cart {

    private List<Item> itemList = new ArrayList<>();
    private List<Product> deletedProducts = new ArrayList<>();
    private boolean checkedOut = false;

    public Cart(UUID uniqueCart) {
    }

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

    public Order checkOut() {
        checkedOut = true;
        List<List<Product>> products = itemList.stream().map(Item::getProducts).collect(Collectors.toList());
        return new Order(products.stream().flatMap(List::stream).collect(Collectors.toList()));
    }
}
