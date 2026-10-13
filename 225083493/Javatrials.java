/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javatrials;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Javatrials {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting time (0 - 23): ");
        int startTime = input.nextInt();

        System.out.print("Enter ending time (1 - 24): ");
        int endTime = input.nextInt();

        // Input Validation
        if (startTime < 0 || startTime >= 23 || endTime < 1 || endTime > 24) {
            System.out.println("Invalid input! Hours must be between 0-23 for start and 1-24 for end.");
            return;
        }
        if (startTime >= endTime) {
            System.out.println("Starting time must be less than ending time.");
            return;
        }

        int totalCost = 0;

        // Iterate hour by hour to compute charges
        for (int hour = startTime; hour < endTime; hour++) {
            if ((hour >= 0 && hour < 7) || (hour >= 21 && hour < 24)) {
                totalCost += 500;
            } else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                totalCost += 1000;
            } else if (hour >= 14 && hour < 19) {
                totalCost += 1500;
            }
        }

        System.out.println("Total rental cost: " + totalCost + " RWF");
        input.close();
    }
} 
    

