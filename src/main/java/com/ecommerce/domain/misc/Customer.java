package main.java.com.ecommerce.domain.misc;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Address address;
    private String customerId;
    private List<BankAccount> bankAccount = new ArrayList<>();

    public Customer(Address address, String customerId) {
        this.address = address;
        this.customerId = customerId;
    }

    public void addAccount(BankAccount account){
        bankAccount.add(account);

    }
    public void updateAddress(Address address){
        this.address = address;
        bankAccount.stream().forEach(bankAccount -> {bankAccount.updateCustomerAddress(address);}
        );
    }



}