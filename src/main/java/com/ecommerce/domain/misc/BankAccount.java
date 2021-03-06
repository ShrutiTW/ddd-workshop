package main.java.com.ecommerce.domain.misc;

public class BankAccount {
    private Address customerAddress;
    private String customerId;
    private String bankAccountId;

    public BankAccount(Address customerAddress, String customerId, String bankAccountId) {
        this.customerAddress = customerAddress;
        this.customerId = customerId;
        this.bankAccountId = bankAccountId;
    }

    public void updateCustomerAddress(Address customerAddress){
        this.customerAddress = customerAddress;
    }
}
