package main.java.com.ecommerce.domain;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private Product product;
    private int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Product" + product + " with quantity " + quantity + " is added to the cart";
    }

    public boolean hasPrice() {
        return false;
    }

    public List<Product> getProducts() {

        ArrayList<Product> products = new ArrayList<>();
        for (int quantityNumber = 0; quantityNumber < quantity; quantityNumber = quantityNumber + 1) {
            products.add(product);
        }
        return products;
    }
}
