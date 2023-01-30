package com.tbz.project.v1;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items;
    private double totalPrice;

    public Order() {
        items = new ArrayList<>();
        totalPrice = 0.0;
    }

    public void addItem(Item item, int quantity) {
        items.add(item);
        totalPrice += item.getPrice() * quantity;
    }

    public void removeItem(Item item, int quantity) {
        items.remove(item);
        totalPrice -= item.getPrice() * quantity;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // getQuantity method
    public int getQuantity(Item item) {
        int quantity = 0;
        for (Item i : items) {
            if (i.getName().equals(item.getName())) {
                quantity++;
            }
        }
        return quantity;
    }

}
