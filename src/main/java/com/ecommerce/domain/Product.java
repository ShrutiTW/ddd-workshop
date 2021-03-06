package main.java.com.ecommerce.domain;


public class Product {
    private String name;
    private Price price;
    private Double weight;

    public Product(String name, Price price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product is " + name + " with price " + price.getValue();
    }


    public Double getPriceValue() {
        return price.getValue();
    }

    public Double getWeight() {
        return weight;
    }
}
