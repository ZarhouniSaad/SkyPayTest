package org.example;

import org.example.service.Account;

public class Main1 {

    //First Scenario : Normal
    public static void main(String[] args) {
        // Initially the balance is 0
        // We can use other constructor to initiate the balance with a value
        Account account=new Account();

        try {
            account.deposit(1000);
            account.deposit(2000);
            account.withdraw(500);
            account.printStatement();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}