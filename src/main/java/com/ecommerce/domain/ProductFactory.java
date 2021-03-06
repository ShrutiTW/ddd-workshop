package main.java.com.ecommerce.domain;

import main.java.com.ecommerce.domain.domain_service.CompetitorPricer;

public class ProductFactory {


    public static Product productFor(String productName) {
        return new Product(productName, CompetitorPricer.discountedPrice(productName));
    }

}

