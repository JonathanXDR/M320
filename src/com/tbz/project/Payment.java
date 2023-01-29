package com.tbz.project;

public class Payment {
    private double balance;

    public Payment(double balance) {
        this.balance = balance;
    }

    public boolean processPayment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}

