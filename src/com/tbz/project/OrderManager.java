package com.tbz.project;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders;
    private Inventory inventory;

    public OrderManager() {
        orders = new ArrayList<>();
        inventory = new Inventory();
    }

    public void placeOrder(Customer customer) {
        Order order = customer.getOrder();
        for (Item item : order.getItems()) {
            if (!inventory.isItemAvailable(item)) {
                System.out.println("Sorry, we are out of stock of " + item.getName() + ". Please remove it from your order.");
                order.removeItem(item);
            }
        }
        if (order.getItems().size() > 0) {
            orders.add(order);
            inventory.attach(order);
            customer.payForOrder();
        } else {
            System.out.println("All items in your order are out of stock. Please place a new order.");
        }
    }

    public void editOrder(Order order) {
        for (Item item : order.getItems()) {
            if (!inventory.isItemAvailable(item)) {
                System.out.println("Sorry, we are out of stock of " + item.getName() + ". Please remove it from your order.");
                order.removeItem(item);
            }
        }
        if (order.getItems().size() > 0) {
            inventory.attach(order);
        } else {
            System.out.println("All items in your order are out of stock. Please place a new order.");
        }
    }

    public void updateInventory(Item item) {
        inventory.addItem(item);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
