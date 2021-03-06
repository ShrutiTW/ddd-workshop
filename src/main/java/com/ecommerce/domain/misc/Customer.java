package main.java.com.ecommerce.domain.misc;

import java.util.UUID;

public class Customer {
    private Address address;
    private String customerId;

    public Customer(Address address, String customerId) {
        this.address = address;
        this.customerId = customerId;
    }

    public void updateAddress(Address address){
        this.address = address;
    }


}