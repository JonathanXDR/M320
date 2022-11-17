package com.tbz.q1;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    private int random;

    public void Start() {
        Random random = new Random();
        this.random = random.nextInt(100);
        while (true) {
            int input = getUserInput();
            if (input == this.random) {
                printMessage("Congrats, you guessed the number!");
                return;
            } else if (input > this.random) {
                printMessage("Guess is too big");
            } else {
                printMessage("Guess is too small");
            }
        }
    }

    private int getUserInput() {
        printMessage("Type in a number");
        return new Scanner(System.in).nextInt();
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}
