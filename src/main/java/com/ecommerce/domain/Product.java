package main.java.com.ecommerce.domain;


public class Product {
    private String name ;
    private Price price ;

    public Product(String name , Price price ) {
        this.name = name;
        this.price= price;
    }

    @Override
    public String toString() {
        return name;
    }


}
