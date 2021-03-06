package main.java.com;

import main.java.com.ecommerce.domain.*;
import main.java.com.ecommerce.domain.domain_service.ProductFactory;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertFalse;

public class CartTest {
    @Test
    public void addItem_ShouldAddIpadProToCart() {
        Product ipadPro = new Product("Ipad pro", new Price("INR", 20.0));
        Item ipadProItem = new Item(ipadPro, 1);
        Cart cart = new Cart(UUID.randomUUID());
        cart.addItem(ipadProItem);
    }

    @Test
    public void addItem_ShouldAddHeroInkPenToCart() {
        Product heroInkPen = new Product("Hero Ink Pen", new Price("INR", 20.0));
        Item heroInkPenItem = new Item(heroInkPen, 0);
        Cart cart = new Cart(UUID.randomUUID());
        cart.addItem(heroInkPenItem);
    }

    @Test
    public void addItem_ShouldAddGMCricketBatWith2Quantity() {
        Product gmCricketBat = new Product("GM Cricket bat", new Price("INR", 50.0));
        Item gmCricketBatItem = new Item(gmCricketBat, 2);
        Cart cart = new Cart(UUID.randomUUID());
        cart.addItem(gmCricketBatItem);
    }

    @Test
    public void removeItem_ShouldRemoveIpadProFromCart() {
        Product ipadPro = new Product("Ipad pro", new Price("INR", 60.0));
        Item ipadProItem = new Item(ipadPro, 1);
        Cart cart = new Cart(UUID.randomUUID());
        cart.addItem(ipadProItem);
        cart.removeItem(ipadProItem);
    }

    @Test
    public void fetchItemsFromTheCart() {
        Product heroInkPen = new Product("Hero Ink Pen", new Price("INR", 30.0));
        Item heroInkPenItem = new Item(heroInkPen, 0);
        Cart cart = new Cart(UUID.randomUUID());
        cart.addItem(heroInkPenItem);

        Product ipadPro = new Product("Ipad pro", new Price("INR", 30.0));
        Item ipadProItem = new Item(ipadPro, 1);
        cart.addItem(ipadProItem);
        cart.removeItem(ipadProItem);

        cart.fetchDeletedProducts();
    }

    @Test
    public void twoCartsShouldNotBeEqual() {

        Cart cart = new Cart(UUID.randomUUID());
        Product heroInkPen = new Product("Hero Ink Pen", new Price("INR", 30.0));
        Item heroInkPenItem = new Item(heroInkPen, 0);
        cart.addItem(heroInkPenItem);

        Cart cartTwo = new Cart(UUID.randomUUID());
        cartTwo.addItem(heroInkPenItem);

        assertFalse(cartTwo.equals(cart));
    }

    @Test
    public void productPriceToBeTenPercentReducedOfCompetitorPrice() {
        Product ipadPro = ProductFactory.productFor("Ipad pro");
        System.out.println(ipadPro.toString());
        //assertTrue(ipadPro.);
        //can assert if we have public price available
    }

    @Test
    public void allProductsInCartToBeCheckedOutAndCartMarkedAsCheckedOut() {
        Cart cart = new Cart(UUID.randomUUID());
        Product heroInkPen = new Product("Hero Ink Pen", new Price("INR", 30.0));
        Item heroInkPenItem = new Item(heroInkPen, 3);
        cart.addItem(heroInkPenItem);
        Order order = cart.checkOut();
    }

}
