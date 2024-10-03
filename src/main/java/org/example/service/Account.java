package org.example.service;

import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService {
    private int balance = 0;
    private List<Transaction> transactions = new ArrayList<>();

    @Override
    public void deposit(int amount) {
        // Amount should be positive
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        transactions.add(new Transaction(amount, balance));
    }

    @Override
    public void withdraw(int amount) {
        // Amount should be positive
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        // Balance should be greater than amount
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance for withdrawal");
        }
        balance -= amount;
        transactions.add(new Transaction(-amount, balance));
    }

    @Override
    public void printStatement() {
        System.out.println("DATE       || AMOUNT  || BALANCE");
        // Printing transactions list in reverse
        for (int i=transactions.size()-1;i>=0;i--) {
            Transaction transaction=transactions.get(i);
            System.out.print(transaction.getDate() + " || " + transaction.getAmount() + "  || " + transaction.getBalance()+"\n");
        }
    }
}
