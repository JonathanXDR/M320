package com.tbz.project;

import java.util.ArrayList;
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

        products.put("Pizza", new Product("Pizza", 5.00, new ArrayList<Topping>() {
            {
                toppings.get("Salat");
                toppings.get("Tomate");
                toppings.get("Käse");
                toppings.get("Zwiebeln");
            }
        }));
        products.put("Burger", new Product("Burger", 5.00, new ArrayList<Topping>() {
            {
                toppings.get("Salat");
                toppings.get("Tomate");
                toppings.get("Käse");
                toppings.get("Sauce");
                toppings.get("Zwiebeln");
            }
        }));
        products.put("Döner", new Product("Döner", 5.00, new ArrayList<Topping>() {
            {
                toppings.get("Salat");
                toppings.get("Tomate");
                toppings.get("Käse");
                toppings.get("Sauce");
                toppings.get("Zwiebeln");
            }
        }));
        products.put("Salat", new Product("Salat", 3.00, new ArrayList<Topping>(){
            {
                toppings.get("Tomate");
                toppings.get("Käse");
                toppings.get("Sauce");
                toppings.get("Zwiebeln");
            }
        }));
        products.put("Cola", new Product("Cola", 2.00));
        products.put("Fanta", new Product("Fanta", 2.00));
        products.put("Wasser", new Product("Wasser", 1.00));
        products.put("Bier", new Product("Bier", 3.00));
    }

    public ArrayList<Topping> getToppings() {
        return new ArrayList<Topping>(toppings.values());
    }

    public ArrayList<Product> getProducts() {
        return new ArrayList<Product>(products.values());
    }
}
