package com.tbz.project;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderTerminal {

    private ArrayList<Product> products = new ArrayList<>();

    public void Start() {
        System.out.println("Welcome to the Order Terminal");
        System.out.println("On the menu today:");
        System.out.println("------------------");
        var todaysMenu = MenuCard.getInstance().getProducts();
        for (var product : todaysMenu)
            System.out.println(product.getName());
        System.out.println("------------------");



        Scanner scanner = new Scanner(System.in);

        while (true) {
            printOrder();

            System.out.println("Please select an option:");
            System.out.println("1. Add Item");
            System.out.println("2. Go to Payment");
            System.out.println("3. Abort Order");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // List available products
                    var availableProducts = printAvailableProducts();

                    // Select product
                    int input = scanner.nextInt();
                    Product selectedProduct = availableProducts.get(input - 1);

                    if (selectedProduct.hasAvailableToppings()) {
                        var availableToppings = selectedProduct.getAvailableToppings();
                        while (true) {
                            for (int i = 0; i < availableToppings.size(); i++) {
                                System.out.println((i + 1) + ". " + selectedProduct.getAvailableToppings().get(i).getName());
                            }
                            System.out.println((availableToppings.size() + 1) + ". No more toppings");

                            // Select toppings
                            int toppingInput = scanner.nextInt();
                            if (toppingInput == availableToppings.size() + 1) {
                                break;
                            }
                            Topping selectedTopping = availableToppings.get(toppingInput - 1);
                            selectedProduct.addTopping(selectedTopping);

                            //Remove added Topping from available Toppings
                            availableToppings.remove(selectedTopping);

                        }
                        // Add product to order
                        products.add(selectedProduct);
                    }

                    System.out.println("Product added!");
                    break;
                case 2:
                    // Go to payment
                    break;
                case 3:
                    // Exit
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }


    }

    private void printOrder() {
        if (products.size() == 0) {
            System.out.println("There are no products in the order");
        } else {
            System.out.println("Current Order:");
            System.out.println("-----------------------");
            for (Product product : products) {
                System.out.println(product.getName());
                for (Topping topping : product.toppings) {
                    System.out.println(" - " + topping.getName());
                }
            }
            System.out.println("-----------------------");
        }
    }

    private ArrayList<Product> printAvailableProducts() {
        System.out.println("Available Products are:");
        ArrayList<Product> availableProducts = MenuCard.getInstance().getProducts();
        for (int i = 0; i < availableProducts.size(); i++) {
            System.out.println((i + 1) + ". " + availableProducts.get(i).getName());
        }
        return availableProducts;
    }
}

