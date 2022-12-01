package com.tbz.d2;

public class D2 {
    public void Start() {
        Flight flight = new Flight();

        Passenger passenger1 = new Passenger();
        passenger1.setName("John");
        flight.addPassenger(passenger1);

        Passenger passenger2 = new Passenger();
        passenger2.setName("Jane");
        flight.addPassenger(passenger2);

        flight.displayPassengers();
    }
}
