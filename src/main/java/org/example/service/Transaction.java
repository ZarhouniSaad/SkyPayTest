package org.example.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private final String date;
    private final int amount;
    private final int balance;

    public Transaction(int amount, int balance) {
        // Using LocalDate.now() to keep it simple
        this.date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));;
        this.amount = amount;
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return this.amount;
    }

    public int getBalance() {
        return balance;
    }
}
