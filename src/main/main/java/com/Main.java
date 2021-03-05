package main.java.com;

import main.java.com.ecom.Cart;
import main.java.com.ecom.Item;
import main.java.com.ecom.Product;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cart cart =new Cart();
        Product ipadPro =new Product("Ipad pro");
        Product heroInkPen =new Product("Hero Ink Pen");
        Product gmCricketBat =new Product("GM Cricket bat");

        Item ipadItem =new Item(ipadPro, 0);
        Item heroInkPenItem =new Item(heroInkPen, 0);
        Item gmCricketBatItem =new Item(gmCricketBat, 2);

        cart.addItem(ipadItem);
        cart.addItem(heroInkPenItem);
        cart.addItem(gmCricketBatItem);

        cart.removeItem(ipadItem);

        List<Product> deletedProducts = cart.fetchDeletedProducts();
        System.out.println(deletedProducts.size());

//        for (Product product : deletedProducts) {
//            System.out.println("Item " + product + " is in cart");
//        }
    }
}
