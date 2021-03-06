package main.java.com.ecommerce.domain;

public class Price {
    private String currencyCode;
    private Double value;

    public Price(String currencyCode, Double value) {
        this.currencyCode = currencyCode;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public static double priceReducedByTenPercent(Price competeitorPrice) {
        return competeitorPrice.getValue() - (competeitorPrice.getValue() * 0.1);
    }
}
