package org.example;

import org.example.service.Account;

public class Main2 {

    //Second Scenario : Négative deposit
    public static void main(String[] args) {
        //initially the amount is 0
        Account account=new Account();

        try {
            account.deposit(-1000);
            account.printStatement();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
