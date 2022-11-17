package com.tbz;

import com.tbz.d1.D1;
import com.tbz.q1.Q1;
import com.tbz.v1.V1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Which Task would you like to run?");

            Scanner scan = new Scanner(System.in);

            String answer = scan.next();

            switch (answer) {
                case "q1":
                    new Q1().Start();
                case "v1":
                    new V1().Start();
                    break;
                case "d1":
                    new D1().Start();
                    break;
                case "info":
                    System.out.println("Available commands: \nq1\nv1\nd1\ninfo");
                    break;
                default:
                    System.out.println("Command not found\ntype info to see the available commands");
            }
        }
    }
}
