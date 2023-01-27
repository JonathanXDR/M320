package com.tbz.project;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;
    private List<InventoryObserver> observers;

    public Inventory() {
        items = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        notifyObservers();
    }

    public void removeItem(Item item) {
        items.remove(item);
        notifyObservers();
    }

    public void attach(InventoryObserver observer) {
        observers.add(observer);
    }

    public void detach(InventoryObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (InventoryObserver observer : observers) {
            observer.update();
        }
    }

    public boolean isItemAvailable(Item item) {
        return items.contains(item);
    }
}

interface InventoryObserver {
    public void update();
}

