package com.tbz.project;

import java.util.ArrayList;

public class Meal extends Product {
    ArrayList<Topping> availableToppings = new ArrayList<>();
    ArrayList<Topping> toppings = new ArrayList<>();

    public Meal(String name, double price, ArrayList<Topping> toppings) {
        super(name, price);
        this.availableToppings = toppings;
    }

    public boolean hasAvailableToppings() {
        return availableToppings.size() >= 0;
    }

    public ArrayList<Topping> getAvailableToppings() {
        return availableToppings;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
        availableToppings.remove(topping);
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }
}
