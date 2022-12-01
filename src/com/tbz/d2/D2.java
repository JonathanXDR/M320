package com.tbz.d2;

public class D2 {
    Flight flight = new Flight();

    public void Start() {

        createPassanger("Jane");


        flight.displayPassengers();
    }

    private void createPassanger(String name) {
        Passenger passenger2 = new Passenger();
        passenger2.setName(name);
        flight.addPassenger(passenger2);
    }
}
