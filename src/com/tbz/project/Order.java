package com.tbz.project;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;
    private double totalCost;
    private String customerName;
    public Order() {
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }
    public void addItem(Item item) {
        items.add(item);
        updateTotalCost();
    }
    public void removeItem(Item item) {
        items.remove(item);
        updateTotalCost();
    }
    public double getTotalCost() {
        return totalCost;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }
    private void updateTotalCost() {
        totalCost = 0;
        for (Item item : items) {
            totalCost += item.getCost();
        }
    }
    public void displayOrder() {
        System.out.println("Order for " + customerName + ":");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getCost());
        }
        System.out.println("Total cost: $" + totalCost);
    }
}

