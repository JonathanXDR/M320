package com.tbz;

import com.tbz.D2.D2;
import com.tbz.d1.D1;
import com.tbz.q1.Q1;
import com.tbz.v1.V1;

import java.util.Scanner;

public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        while (true) {
            System.out.println("Which Task would you like to run?");

            Scanner scan = new Scanner(System.in);

            String answer = scan.next();
            try {
                switch (answer) {
                    case "q1":
                        new Q1().Start();
                    case "v1":
                        new V1().Start();
                        break;
                    case "d1":
                        new D1().Start();
                        break;
                    case "d2":
                        new D2().Start();
                        break;
                    case "info":
                        System.out.println(YELLOW + "Available commands: \nq1\nv1\nd1\ninfo" + RESET);
                        break;
                    default:
                        System.out.println(RED + "Command not found " + YELLOW + "\ntype info to see the available commands" + RESET);
                }
            }catch (Exception ex){
                System.out.println(YELLOW + "An Exception occurred" + RESET);
                System.out.println(RED + ex + RESET);
            }
        }
    }
}
