package main.java.com.ecommerce.domain;

import java.util.List;

public class Order {
    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

    public Double totalAmount() {
        Double totalProductValue = products.stream().mapToDouble(product -> product.getPriceValue().doubleValue()).sum();
        Double totalAmountPerWeight = products.stream().mapToDouble(product -> product.getWeight()* 0.1).sum();
        Double totalProductPrice = totalProductValue + totalAmountPerWeight;
        return  totalProductPrice;

    }
}
