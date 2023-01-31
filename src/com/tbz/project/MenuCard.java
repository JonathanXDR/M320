package com.tbz.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MenuCard {
    private static MenuCard _instance;

    HashMap<String, Product> products = new HashMap<>();
    HashMap<String, Topping> toppings = new HashMap<>();


    public static MenuCard getInstance() {
        if (_instance == null) {
            _instance = new MenuCard();
        }
        return _instance;
    }

    public MenuCard() {
        toppings.put("Salat", new Topping("Salat", 0.50));
        toppings.put("Tomate", new Topping("Tomate", 0.50));
        toppings.put("Käse", new Topping("Käse", 0.50));
        toppings.put("Sauce", new Topping("Sauce", 0.50));
        toppings.put("Zwiebeln", new Topping("Zwiebeln", 0.50));

        products.put("Pizza", new Meal("Pizza", 5.00, new ArrayList<Topping>(Arrays.asList(
                toppings.get("Salat"),
                toppings.get("Tomate"),
                toppings.get("Käse"),
                toppings.get("Zwiebeln")
        ))));
        products.put("Burger", new Meal("Burger", 5.00, new ArrayList<Topping>(Arrays.asList(
                toppings.get("Salat"),
                toppings.get("Tomate"),
                toppings.get("Käse"),
                toppings.get("Sauce"),
                toppings.get("Zwiebeln")
        ))));

        products.put("Döner", new Meal("Döner", 5.00, new ArrayList<Topping>(Arrays.asList(
                toppings.get("Salat"),
                toppings.get("Tomate"),
                toppings.get("Käse"),
                toppings.get("Sauce"),
                toppings.get("Zwiebeln")
        ))));

        products.put("Salat", new Meal("Salat", 3.00, new ArrayList<Topping>(Arrays.asList(
                toppings.get("Tomate"),
                toppings.get("Käse"),
                toppings.get("Sauce"),
                toppings.get("Zwiebeln")
        ))));

        products.put("Cola", new Drink("Cola", 2.00));
        products.put("Fanta", new Drink("Fanta", 2.00));
        products.put("Wasser", new Drink("Wasser", 1.00));
        products.put("Bier", new Drink("Bier", 3.00));
    }

    public ArrayList<Topping> getToppings() {
        return new ArrayList<Topping>(toppings.values());
    }

    public ArrayList<Product> getProducts() {
        return new ArrayList<>(Arrays.asList(products.values().toArray(Product[]::new)));
    }
}
