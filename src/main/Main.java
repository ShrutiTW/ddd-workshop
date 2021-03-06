package main;

import main.java.com.ecommerce.domain.Cart;
import main.java.com.ecommerce.domain.Item;
import main.java.com.ecommerce.domain.Product;
import main.java.com.ecommerce.domain.ProductFactory;

import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Cart cart = new Cart(UUID.randomUUID());

        Product ipadPro = ProductFactory.productFor("Ipad pro");
        Product heroInkPen = ProductFactory.productFor("Hero Ink Pen");
        Product gmCricketBat = ProductFactory.productFor("GM Cricket bat");

        Item ipadItem = new Item(ipadPro, 0);
        Item heroInkPenItem = new Item(heroInkPen, 0);
        Item gmCricketBatItem = new Item(gmCricketBat, 2);

        cart.addItem(ipadItem);
        cart.addItem(heroInkPenItem);
        cart.addItem(gmCricketBatItem);

        cart.removeItem(ipadItem);

        List<Product> deletedProducts = cart.fetchDeletedProducts();

        Cart cartTwo = new Cart(UUID.randomUUID());
        cartTwo.addItem(ipadItem);

        Cart cartThree = new Cart(UUID.randomUUID());
        cartThree.addItem(ipadItem);

        System.out.println("Check if two cart is equal or not ->" + cartTwo.equals(cartThree));

        cart.checkOut();


    }
}
