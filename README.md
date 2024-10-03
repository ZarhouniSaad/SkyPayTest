# SkyPayTest
# Bank Kata

This project is a simple banking system implemented in Java. It allows users to create an account, make deposits, withdraw funds, and print their transaction statements.

## Features

- **Account Management:** Create an account and manage funds through deposits and withdrawals.
- **Transaction Tracking:** Keep track of all transactions, including dates, amounts, and balances.
- **Error Handling:** Properly handles invalid operations, such as negative deposits and withdrawals exceeding the account balance.

## Classes

### 1. `AccountService`

This interface defines the basic operations for managing an account:
- `void deposit(int amount)`
- `void withdraw(int amount)`
- `void printStatement()`

### 2. `Account`

Implements the `AccountService` interface. It manages the account balance and tracks transactions.
- **Attributes:**
  - `int balance`: The current balance of the account.
  - `List<Transaction> transactions`: A list of all transactions made.

### 3. `Transaction`

Represents a financial transaction, storing the date, amount, and balance after the transaction.
- **Attributes:**
  - `String date`: The date of the transaction.
  - `int amount`: The amount of the transaction (positive for deposits, negative for withdrawals).
  - `int balance`: The account balance after the transaction.

### 4. `Main1`

Demonstrates a normal scenario of depositing and withdrawing funds, followed by printing the account statement.

### 5. `Main2`

Tests the system's behavior when trying to deposit a negative amount.

### 6. `Main3`

Tests the system's behavior when attempting to withdraw more than the available balance.

### 7. `AccountTest`

JUnit test case for the `Account` class, ensuring that the printed statement matches the expected format after a series of deposits and a withdrawal.
