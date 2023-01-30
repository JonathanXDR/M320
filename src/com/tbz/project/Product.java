package com.tbz.project;

import java.util.ArrayList;
import java.util.HashMap;

public class Product {
    private String name;
    private double price;
    ArrayList<Topping> availableToppings = new ArrayList<>();
    ArrayList<Topping> toppings = new ArrayList<>();

    public Product(String name, double price, ArrayList<Topping> toppings) {
        this.name = name;
        this.price = price;
        this.availableToppings = toppings;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public boolean hasAvailableToppings() {
        return availableToppings.size() > 0;
    }

    public ArrayList<Topping> getAvailableToppings() {
        return availableToppings;
    }
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
}
