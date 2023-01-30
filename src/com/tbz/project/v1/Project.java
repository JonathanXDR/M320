package com.tbz.project.v1;
import java.util.Scanner;

public class Project {

    public static void Start() {
        Scanner scan = new Scanner(System.in);
        OrderSystem orderSystem = new OrderSystem();

        while (true) {
            orderSystem.showMainMenu();
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    orderSystem.placeOrder();
                    break;
                case 2:
                    orderSystem.editOrder();
                    break;
                case 3:
                    orderSystem.payOrder();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
