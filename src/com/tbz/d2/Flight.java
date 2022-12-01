package com.tbz.d2;
import java.util.List;
import java.util.ArrayList;

public class Flight {
    List<Passenger> passengers = new ArrayList<Passenger>();

    public void displayPassengers() {
        for (Passenger passenger : passengers) {
            passenger.displayName();
        }
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
}
