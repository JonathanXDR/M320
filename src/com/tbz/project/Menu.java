package com.tbz.project;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static Menu instance;
    private List<Item> items;
    private Menu() {
        items = new ArrayList<>();
        //populate menu with items
        items.add(new Döner("Chicken Döner", 8.99));
        items.add(new Döner("Lamb Döner", 9.99));
        items.add(new Döner("Vegetarian Döner", 7.99));
        items.add(new FillingDecorator(new Döner("Chicken Döner", 8.99),"Cheese", 0.50));
        items.add(new MeatDecorator(new Döner("Chicken Döner", 8.99),"Extra Chicken", 1.50));
        items.add(new BreadDecorator(new Döner("Chicken Döner", 8.99),"Whole wheat", 0.50));
    }
    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }
    public void displayMenu() {
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getCost());
        }
    }
    public Item getItem(int itemId) {
        return items.get(itemId);
    }
}

