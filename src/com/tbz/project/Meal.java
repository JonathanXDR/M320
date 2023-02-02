package com.tbz.project;

import java.util.ArrayList;

public class Meal extends Product {
    private final ArrayList<Topping> availableToppings;
    ArrayList<Topping> toppings = new ArrayList<>();

    public Meal(String name, double price, ArrayList<Topping> toppings) {
        super(name, price);
        availableToppings = toppings;
    }

    public boolean hasAvailableToppings() {
        return availableToppings.size() >= 0;
    }

    public ArrayList<Topping> getAvailableToppings() {
        return (ArrayList<Topping>) availableToppings.clone();
    }



    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }
}
