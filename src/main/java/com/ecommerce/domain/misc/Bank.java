package main.java.com.ecommerce.domain.misc;

import java.util.List;

public class Bank {
    private List<BankAccount> customerBankAccount;

    public Bank(List<BankAccount> customerBankAccount) {
        this.customerBankAccount = customerBankAccount;
    }
}
