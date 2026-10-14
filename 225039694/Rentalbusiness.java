package com.mycompany.rentalbusiness;

import java.util.Scanner;

public class Rentalbusiness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter starting hour (0-23): ");
        int startTime = scanner.nextInt();

        System.out.print("Enter ending hour (1-24): ");
        int endTime = scanner.nextInt();

       
        if (startTime < 0 || startTime > 23 || endTime < 1 || endTime > 24) {
            System.out.println("Error: Invalid hour range.");
            return;
        }
        if (startTime >= endTime) {
            System.out.println("Error: Starting time must be less than ending time.");
            return;
        }

        int totalCost = 0;

        
        for (int hour = startTime; hour < endTime; hour++) {
            if ((hour >= 0 && hour < 7) || (hour >= 21 && hour < 24)) {
                totalCost += 500;
            } else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                totalCost += 1000;
            } else if (hour >= 14 && hour < 19) {
                totalCost += 1500;
            }
        }

        
        System.out.println("Total rental fee: " + totalCost + " RWF");
        
        scanner.close();
    }
}
