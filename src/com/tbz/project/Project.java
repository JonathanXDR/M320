package com.tbz.project;

import java.util.Scanner;

public class Project {
    private static Order order;
    private static Menu menu;
    private static Payment payment;
    private static Customer customer;
    private static OrderManager orderManager;
    private static Inventory inventory;
    public static void Start() {
        // Initialize objects
        order = new Order();
        menu = Menu.getInstance();
        payment = new Payment();
        customer = new Customer();
        orderManager = new OrderManager();
        inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to our Döner Shop!");
            System.out.println("1. Browse menu");
            System.out.println("2. Edit order");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Enter a command: ");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    menu.displayMenu();
                    break;
                case 2:
                    orderManager.editOrder(order));
                    break;
                case 3:
                    payment.processPayment(order);
                    break;
                case 4:
                    System.out.println("Thank you for visiting our shop. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
        }
    }
}
