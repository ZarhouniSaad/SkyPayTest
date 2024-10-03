package org.example;

import org.example.service.Account;

public class Main1 {
    public static void main(String[] args) {
        //initially the amount is 0
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