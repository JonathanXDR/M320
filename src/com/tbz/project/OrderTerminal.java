package com.tbz.project;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderTerminal {

    private final ArrayList<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void Start() {
        System.out.println("Welcome to the Order Terminal");
        printMenu();

        while (true) {
            printOrder();

            printOptions();

            int option = readInt("", 1, 4);

            switch (option) {
                case 1:
                    // List available products
                    var availableProducts = printAvailableProducts();

                    // Select product
                    int input = readInt("", 1, availableProducts.size());
                    Product selectedProduct = availableProducts.get(input - 1);

                    if (selectedProduct.getClass() == Meal.class && ((Meal) selectedProduct).hasAvailableToppings()) {
                        var selectedMeal = (Meal) selectedProduct;
                        var toppings = askForToppings(selectedMeal);
                        selectedMeal.setToppings(toppings);
                        products.add(selectedMeal);

                    } else {
                        // Add product to order
                        products.add(selectedProduct);
                    }
                    System.out.println("Product added!");
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    checkoutOrder();
                    return;
                case 4:
                    // Exit
                    System.out.println("Order aborted!");
                    return;
                default:
                    System.out.println("Invalid input; Try again!");
                    break;
            }
        }


    }

    private void checkoutOrder() {
        // Go to payment
        var totalPrice = printOrder();
        if (totalPrice > 0) {
            System.out.println("Please pay " + totalPrice + " CHF");
        } else {
            System.out.println("You have nothing to pay!");
        }
        System.out.println("Thank you for your order!");
    }

    private void removeProduct() {
        // Print all products
        for (int i = 0; i < products.size(); i++) {
            var product = products.get(i);

            if (product.getClass() == Meal.class && ((Meal) product).hasAvailableToppings()) {
                var meal = (Meal) product;
               var toppingString = getToppingsString(meal.getToppings());

                System.out.println((i + 1) + ". " + product.getName() +" " + toppingString);
            }
            else{
                System.out.println((i + 1) + ". " + product.getName());

            }
        }
        // Select product
        int removeInput = readInt("Select Product that you want to remove", 1, products.size());
        products.remove(removeInput - 1);
    }


    private String getToppingsString(ArrayList<Topping> toppingList) {
        String toppingString = "(";
        for (int i = 0; i < toppingList.size(); i++) {
            toppingString += toppingList.get(i).getName();
            if(i < toppingList.size() - 1){
                toppingString +=  ", ";
            }
        }
        return toppingString + ")";
    }

    private ArrayList<Topping> askForToppings(Meal meal) {
        ArrayList<Topping> selectedToppings = new ArrayList<>();

        System.out.println("Toppings:");
        var availableToppings = meal.getAvailableToppings();
        while (true) {
            for (int i = 0; i < availableToppings.size(); i++) {
                System.out.println((i + 1) + ". " + availableToppings.get(i).getName());
            }
            System.out.println((availableToppings.size() + 1) + ". No more toppings");

            // Select toppings
            int toppingInput = readInt("Please select toppings", 1, availableToppings.size() + 1);
            if (toppingInput == availableToppings.size() + 1) {
                break;
            }
            Topping selectedTopping = availableToppings.get(toppingInput - 1);
            selectedToppings.add(selectedTopping);
            availableToppings.remove(selectedTopping);
        }
        return selectedToppings;
    }

    private void printOptions() {
        System.out.println("Please select an option:");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Go to Payment");
        System.out.println("4. Abort Order");

    }

    private void printMenu() {
        System.out.println("------------------");
        System.out.println("On the menu today:");
        var todaysMenu = MenuCard.getInstance().getProducts();
        for (var product : todaysMenu)
            System.out.println(product.getName());
        System.out.println("------------------");
    }

    private float printOrder() {
        float totalPrice = 0;

        if (products.size() != 0) {
            System.out.println("-----------------------");
            System.out.println("Current Order:");

            for (Product product : products) {
                System.out.println(product.getName() + " " + product.getPrice() + " CHF");
                totalPrice += product.getPrice();
                if (product.getClass() == Meal.class) {
                    var meal = (Meal) product;
                    for (Topping topping : meal.getToppings()) {
                        System.out.println(" - " + topping.getName() + " " + topping.getPrice() + " CHF");
                        totalPrice += topping.getPrice();
                    }
                }
            }
            System.out.println("Total: " + totalPrice + " CHF");
            System.out.println("-----------------------");
            return totalPrice;
        }
        return 0.0f;
    }

    private ArrayList<Product> printAvailableProducts() {
        System.out.println("Available Products are:");
        ArrayList<Product> availableProducts = MenuCard.getInstance().getProducts();
        for (int i = 0; i < availableProducts.size(); i++) {
            System.out.println((i + 1) + ". " + availableProducts.get(i).getName());
        }
        return availableProducts;
    }

    private int readInt(String text, int min, int max) {
        System.out.println(text);
        while (true) {

            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Invalid input; Try again!");
                }
            } else {
                scanner.next();
                System.out.println("Invalid input; Try again!");
            }
        }
    }
}

