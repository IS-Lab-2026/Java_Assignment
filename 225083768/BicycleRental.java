package com.mycompany.bicyclerental;

import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting hour (0-23): ");
        int start = scanner.nextInt();
        System.out.print("Enter ending hour (1-24): ");
        int end = scanner.nextInt();

        if (start < 0 || start > 23 || end < 1 || end > 24 || start >= end) {
            System.out.println("Invalid input.");
        } else {
            int totalCost = 0;
            for (int hour = start; hour < end; hour++) {
                if (hour < 7 || hour >= 21) {
                    totalCost += 500;
                } else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                    totalCost += 1000;
                } else {
                    totalCost += 1500;
                }
            }
            System.out.println("Total rental cost: " + totalCost + " RWF");
        }
        scanner.close();
    }
}