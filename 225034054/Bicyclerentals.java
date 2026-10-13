package com.mycompany.bicyclerentals;
import java.util.Scanner;

public class BicycleRentals {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   System.out.print("\nEnter start time (0 - 23): ");
   int startTime = sc.nextInt();
   
   System.out.print("\nEnter end time (1 - 24): ");
   int endTime = sc.nextInt();
  
  if (startTime < 0 || startTime >= 23 || endTime < 1 || endTime > 24 || startTime >= endTime) {
           
     System.out.println("Invalid Range! Enter the valid time range.");
        }
  
        int totalCost = 0;
        for (int hour = startTime; hour < endTime; hour++) {
            if (hour < 7 || hour >= 21) {
                totalCost += 500;
            } 
            else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                totalCost += 1000;
            } 
            else if (hour >= 14 && hour < 19) {
                totalCost += 1500;
            }
        }

        System.out.println("\nTotal rent to pay: " + totalCost + " RWF \n");
        sc.close();
    }
}

