package com.tbz.project;

import java.util.Scanner;

public class Payment {
    private double totalCost;
    public Payment(double totalCost) {
        this.totalCost = totalCost;
    }
    public boolean processPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total cost: $" + totalCost);
        System.out.println("Enter payment method (1 for credit card, 2 for debit card, 3 for cash): ");
        int paymentMethod = scanner.nextInt();
        if (paymentMethod == 1) {
            //process credit card payment
            System.out.println("Enter credit card number: ");
            String creditCardNumber = scanner.next();
            System.out.println("Enter expiration date (MM/YY): ");
            String expirationDate = scanner.next();
            System.out.println("Enter CVV: ");
            String cvv = scanner.next();
            //validate credit card information and process payment
            return true;
        } else if (paymentMethod == 2) {
            //process debit card payment
            System.out.println("Enter debit card number: ");
            String debitCardNumber = scanner.next();
            System.out.println("Enter expiration date (MM/YY): ");
            String expirationDate = scanner.next();
            System.out.println("Enter CVV: ");
            String cvv = scanner.next();
            //validate debit card information and process payment
            return true;
        } else if (paymentMethod == 3) {
            //process cash payment
            System.out.println("Enter amount tendered: ");
            double cash = scanner.nextDouble();
            if (cash >= totalCost) {
                //calculate change
                return true;
            } else {
                System.out.println("Insufficient funds. Please enter a higher amount.");
                return false;
            }
        }
    }
}