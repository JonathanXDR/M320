package com.tbz.d2;

import java.util.List;
import java.util.ArrayList;

public class Flight {
    private List<Passenger> passengers = new ArrayList<Passenger>();

    public static String test;

    public void displayPassengers() {
        for (Passenger passenger : passengers) {
            passenger.displayName();
        }
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
}
