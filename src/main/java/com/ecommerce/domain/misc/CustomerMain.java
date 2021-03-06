package main.java.com.ecommerce.domain.misc;

import java.util.UUID;

public class CustomerMain {
    public static void main(String[] args) {
        Address bhopal = new Address("Bhopal");
        Customer customer = new Customer(bhopal, UUID.randomUUID().toString());
        BankAccount customerAccount = new BankAccount(bhopal,UUID.randomUUID().toString(),UUID.randomUUID().toString());
        customer.addAccount(customerAccount);

        Address gurgaon = new Address("Gurgaon");
        customer.updateAddress(gurgaon);


    }
}
