package com.tbz.q3;

import calendar.Calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TUI {
    private static TUI instance;
    private boolean isRunning;

    public static TUI getInstance() {
        if (instance == null) {
            instance = new TUI();
        }
        return instance;
    }

    public void start() {
        this.isRunning = true;
        createDate();
    }

    private void createDate() {
        String pattern = getUserInput("\nPlease enter a date pattern (default: dd.MM.yyyy): ");
        String startDate = getUserInput("Please enter a start date: ");
        String endDate = getUserInput("Please enter a end date: ");
        try {
            Calendar.setInstance(startDate, endDate, pattern);
        } catch (DumbUserException e) {
            System.out.println(e.getMessage());
            createDate();
        }
        options();
    }

    private void options() {
        int controller = 0;
        do {
            String userInput = "";
            System.out.println("""
                    
                    YOUR OPTIONS
                    ============
                    1) Seconds Between
                    2) Minutes between
                    3) Hours between
                    4) Months between
                    5) Years between
                    6) Change dates
                    """);
            try {
                userInput = getUserInput("Please enter your option: ");
                switch (Integer.parseInt(userInput)) {
                    case 1 -> System.out.println(Calendar.getInstance().secondsBetween());
                    case 2 -> System.out.println(Calendar.getInstance().minutesBetween());
                    case 3 -> System.out.println(Calendar.getInstance().hoursBetween());
                    case 4 -> System.out.println(Calendar.getInstance().monthsBetween());
                    case 5 -> System.out.println(Calendar.getInstance().yearsBetween());
                    case 6 -> createDate();
                    default -> System.out.println("\u001b[31m\nYour input is not an option sadly...\u001b[0m");
                }
            } catch (NumberFormatException e) {
                System.out.printf("\u001b[31m\nDoes \"%s\" look like a number to you?\n\u001b[0m", userInput);
            }
            controller++;
        } while (this.isRunning && controller < 1000);
    }

    private void shutdown() {
        System.out.println("Shutting down the process...");
        this.isRunning = false;
        System.exit(0);
    }

    private String getUserInput(String message) {
        String userInput = "";
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        try {
            System.out.print(message);
            userInput = reader.readLine();
            if (isExit(userInput)) shutdown();
        } catch (IOException e) {
            System.out.println("An unexpected exception occurred. Please try again...");
        }
        return userInput;
    }

    private boolean isExit(String input) {
        return input.equalsIgnoreCase("exit");
    }
}
