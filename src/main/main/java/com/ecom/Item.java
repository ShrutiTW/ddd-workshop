package main.java.com.ecom;

public class Item {
    private Product product;
    private int quantity ;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Product" + product +" with quantity " +quantity + " is added to the cart" ;
    }
}
