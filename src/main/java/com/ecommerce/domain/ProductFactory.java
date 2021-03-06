package main.java.com.ecommerce.domain;

import java.util.HashMap;

public class ProductFactory {

    private static HashMap<String, Price> competitorPrice = new HashMap() {{
        put("Ipad pro", new Price("INR", 30.0));
        put("Hero Ink Pen", new Price("INR", 50.0));
        put("GM Cricket bat", new Price("INR", 80.0));
    }};

    public static Product productFor(String productName) {
        return new Product(productName, discountedPrice(productName));
    }

    private static Price discountedPrice(String productName) {
        Price competeitorPrice = ProductFactory.competitorPrice.get(productName);
        return new Price("INR", (competeitorPrice.getValue() - (competeitorPrice.getValue() * 0.1)));
    }

}

