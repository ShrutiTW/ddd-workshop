package main.java.com.ecommerce.domain.domain_service;

import main.java.com.ecommerce.domain.Price;

import java.util.HashMap;

public class CompetitorPricer {
    private static HashMap<String, Price> competitorPrice = new HashMap() {{
        put("Ipad pro", new Price("INR", 30.0));
        put("Hero Ink Pen", new Price("INR", 50.0));
        put("GM Cricket bat", new Price("INR", 80.0));
    }};


    public static Price discountedPrice(String productName) {
        Price competitorProductPrice = competitorPrice.get(productName);
        return new Price("INR", Price.priceReducedByTenPercent(competitorProductPrice));
    }
}
