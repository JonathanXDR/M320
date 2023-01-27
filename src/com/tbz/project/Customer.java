package com.tbz.project;

import java.util.Scanner;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private Order order;

    public Customer() {
    }

    public void placeOrder(Menu menu) {
        order = new Order();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name: ");
        name = scanner.nextLine();
        System.out.println("Enter customer email: ");
        email = scanner.nextLine();
        System.out.println("Enter customer phone: ");
        phone = scanner.nextLine();

        boolean finished = false;
        while (!finished) {
            menu.displayMenu();
            System.out.println("Enter the number of the item you would like to order: ");
            int itemNum = scanner.nextInt();
            Item item = menu.getItem(itemNum);
            if (item != null) {
                order.addItem(item);
            } else {
                System.out.println("Invalid item number. Please try again.");
            }
            System.out.println("Would you like to order another item? (y/n)");
            String another = scanner.next();
            if (another.equalsIgnoreCase("n")) {
                finished = true;
            }
        }
    }

    public void payForOrder() {
        Payment payment = new Payment(order.getTotalCost());
        if (payment.processPayment()) {
            System.out.println("Payment successful. Thank you for your order!");
        } else {
            System.out.println("Payment failed. Please try again.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}

