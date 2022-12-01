package com.tbz.d2;

import java.util.Scanner;

public class D2 {
    Flight flight = new Flight();

    public void Start() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a name: ");
            String name = scanner.nextLine();
            if (name.equals("exit")) {
                break;
            }
            createPassanger(name);
        } while (true);

        flight.displayPassengers();
    }

    private void createPassanger(String name) {
        Passenger passenger2 = new Passenger();
        passenger2.setName(name);
        flight.addPassenger(passenger2);
    }
}
