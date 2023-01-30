package com.tbz.project.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderSystem {
    public static final String COLOR_RESET = "\u001B[0m";
    public static final String COLOR_BLACK = "\u001B[30m";
    public static final String COLOR_RED = "\u001B[31m";
    public static final String COLOR_GREEN = "\u001B[32m";
    public static final String COLOR_YELLOW = "\u001B[33m";

    public static final String COLOR_ORANGE = "\u001B[38;5;208m";
    public static final String COLOR_BLUE = "\u001B[34m";
    public static final String COLOR_PURPLE = "\u001B[35m";
    public static final String COLOR_CYAN = "\u001B[36m";
    public static final String COLOR_WHITE = "\u001B[37m";
    private static OrderSystem instance;
    private final List<Product> productMenu;
    private final List<Drink> drinkMenu;
    private final Scanner scan;
    private Order currentOrder;

    OrderSystem() {
        scan = new Scanner(System.in);
        productMenu = new ArrayList<>();
        drinkMenu = new ArrayList<>();
        currentOrder = null;
        initMenu();
    }

    public static OrderSystem getInstance() {
        if (instance == null) {
            instance = new OrderSystem();
        }
        return instance;
    }

    private void initMenu() {
        // create an array of all products
        Product burger = new Product("Burger", 12.0, "Bread", "Filling", "Sauce");
        Product fries = new Product("Fries", 5.0, "Potato", "Salt", "Ketchup");
        Product döner = new Product("Döner", 11.5, "Bread", "Meat", "Sauce");

        productMenu.add(burger);
        productMenu.add(fries);
        productMenu.add(döner);

        Drink ayran = new Drink("Ayran", 3.0);
        Drink cola = new Drink("Cola", 3.5);
        Drink fanta = new Drink("Fanta", 3.5);
        Drink sprite = new Drink("Sprite", 3.0);
        Drink water = new Drink("Water", 2.0);
        Drink iceTea = new Drink("Ice Tea", 2.5);

        drinkMenu.add(ayran);
        drinkMenu.add(cola);
        drinkMenu.add(fanta);
        drinkMenu.add(sprite);
        drinkMenu.add(water);
        drinkMenu.add(iceTea);
    }

    public void showMainMenu() {
        System.out.println("Order System Main Menu");
        System.out.println("1. Place Order");
        System.out.println("2. Edit Order");
        System.out.println("3. Pay Order");
        System.out.println("4. Exit");
    }

    public void placeOrder() {
        currentOrder = new Order();
        System.out.println("---- Products ----");

        for (int i = 0; i < productMenu.size(); i++) {
            System.out.println((i + 1) + ". " + productMenu.get(i).getName() + " [" + productMenu.get(i).getPrice() + " CHF]");
        }

        System.out.println();

        System.out.println("---- Drinks ----");
        for (int i = 0; i < drinkMenu.size(); i++) {
            System.out.println((i + 1 + productMenu.size()) + ". " + drinkMenu.get(i).getName() + " [" + drinkMenu.get(i).getPrice() + " CHF]");
        }

        System.out.println("Enter the item number(s) to add to the order (e.g. " + COLOR_BLUE + "1" + COLOR_RESET + COLOR_RESET + " or " + COLOR_GREEN + "1,2,3" + " or " + COLOR_PURPLE + "1 [4x]" + COLOR_RESET + " or " + COLOR_RED + "1 [4x], 2 [2x]" + COLOR_RESET + "):");

        String input = scan.nextLine();
        String[] items = input.split(",");
        for (String item : items) {
            // Remove any leading or trailing spaces from the item
            item = item.trim();
            int quantity = 1;
            int itemNum = -1;
            // Check if the item has a quantity specified
            if (item.contains("[") && item.contains("x")) {
                // Extract the quantity
                int start = item.indexOf("[") + 1;
                int end = item.indexOf("x");
                String quantityString = item.substring(start, end);
                quantity = Integer.parseInt(quantityString);
                // Extract the item number
                itemNum = Integer.parseInt(item.substring(0, start - 2));
            } else {
                // Otherwise, the item number is the only value provided
                itemNum = Integer.parseInt(item);
            }
            // Check if the item is a product or a drink
            if (itemNum <= productMenu.size()) {
                currentOrder.addItem(productMenu.get(itemNum - 1), quantity);
            } else {
                currentOrder.addItem(drinkMenu.get(itemNum - productMenu.size() - 1), quantity);
            }
        }

        System.out.println("Order placed successfully.");
        System.out.println(currentOrder.getItems());
        System.out.println("Total Price: " + currentOrder.getTotalPrice());
    }

    public void editOrder() {
        if (currentOrder == null) {
            System.out.println("No order placed yet.");
            return;
        }

        // list all items in the order
        System.out.println("---- Order Items ----");
        for (int i = 0; i < currentOrder.getItems().size(); i++) {
            System.out.println((i + 1) + ". " + currentOrder.getItems().get(i).getName() + " [" + currentOrder.getItems().get(i).getPrice() + " CHF] x" + currentOrder.getQuantity(currentOrder.getItems().get(i)));
        }

        String input = scan.nextLine();
        String[] items = input.split(",");
        for (String item : items) {
            // Remove any leading or trailing spaces from the item
            item = item.trim();
            int quantity = 1;
            int itemNum = -1;
            // Check if the item has a quantity specified
            if (item.contains("[") && item.contains("x")) {
                // Extract the quantity
                int start = item.indexOf("[") + 1;
                int end = item.indexOf("x");
                String quantityString = item.substring(start, end);
                quantity = Integer.parseInt(quantityString);
                // Extract the item number
                itemNum = Integer.parseInt(item.substring(0, start - 2));
            } else {
                // Otherwise, the item number is the only value provided
                itemNum = Integer.parseInt(item);
            }
            // Check if the item is a product or a drink
            if (itemNum <= productMenu.size()) {
                currentOrder.addItem(productMenu.get(itemNum - 1), quantity);
            } else {
                currentOrder.addItem(drinkMenu.get(itemNum - productMenu.size() - 1), quantity);
            }
        }
    }

    public void payOrder() {
        if (currentOrder == null) {
            System.out.println("No order placed yet.");
            return;
        }
        Payment payment = new Payment(100.0);

        System.out.println("---- Order Items ----");
        for (int i = 0; i < currentOrder.getItems().size(); i++) {
            System.out.println((i + 1) + ". " + currentOrder.getItems().get(i).getName() + " [" + currentOrder.getItems().get(i).getPrice() + " CHF] x" + currentOrder.getQuantity(currentOrder.getItems().get(i)));
        }

        System.out.println();
        System.out.println("---- Payment ----");
        System.out.println("Current Balance: " + payment.getBalance());
        System.out.println("Total Price: " + currentOrder.getTotalPrice());
        System.out.println();
        System.out.println("Confirm payment? (y/n)");
        String input = scan.nextLine();
        if (!input.equals("y")) {
            System.out.println("Payment cancelled.");
            return;
        }

        boolean paymentSuccessful = payment.processPayment(currentOrder.getTotalPrice());
        if (paymentSuccessful) {
            System.out.println("Payment successful. Thank you for your purchase. Enjoy your meal!");
            System.out.println("Current Balance: " + payment.getBalance());

            currentOrder = null;
        } else {
            System.out.println("Payment unsuccessful. Please add more funds and try again.");
            System.out.println("You need" + (currentOrder.getTotalPrice() - payment.getBalance()) + " CHF more to pay for your order.");
        }
    }
}

