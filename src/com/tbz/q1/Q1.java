package com.tbz.q1;
import java.util.Random;
import java.util.Scanner;

public class Q1 {
    private int random;

    public void Start() {
        Random random = new Random();
        this.random = random.nextInt(100);
        while (true) {
            System.out.println("Type in a number");
            int input = new Scanner(System.in).nextInt();
            if (input == this.random) {
                System.out.println("Congrats, you guessed the number!");
                return;
            } else if (input > this.random) {
                System.out.println("Guess is too big");
            } else {
                System.out.println("Guess is too small");
            }
        }
    }
}
