package main.java.com.ecommerce.domain.domain_service;

import main.java.com.ecommerce.domain.Product;

public class ProductFactory {


    public static Product productFor(String productName) {
        return new Product(productName, CompetitorPricer.discountedPrice(productName));
    }

}

