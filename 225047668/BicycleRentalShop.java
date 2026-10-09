package com.mycompany.scenario1;

import java.util.Scanner;

public class Scenario1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Here are the rates for the bicyle rental fee");
        System.out.println("  00h - 07h and 21h - 24h : 500 RWF");
        System.out.println("  07h - 14h and 19h - 21h : 1000 RWF");
        System.out.println("  14h - 19h               : 1500 RWF");
        System.out.println("Enter whole numbers only (no decimals).");
        System.out.println("Starting hour: 0-23 | Ending hour: 1-24 | Start must be less than end.");
        
        
        System.out.print("Enter starting hour (0-23): ");
       
        if (!input.hasNextInt()) {
            System.out.println("Invalid input: whole numbers only.");
            return;
        }
        int start = input.nextInt();

        System.out.print("Enter ending hour (1-24): ");
        if (!input.hasNextInt()) {
            System.out.println("Invalid input: whole numbers only.");
            return;
        }
        int end = input.nextInt();
        if (start < 0 || start > 23 || end < 1 || end > 24 || start >= end) {
            System.out.println("Invalid range: start must be 0-23, end 1-24, and start < end.");
            return;
        }
            int hours500 = 0, hours1000 = 0, hours1500 =0;
            int total = 0;

        for (int h = start; h < end; h++) {
            if (h < 7 || h >= 21) {       
                hours500++;
                total += 500;
            } else if (h < 14 || h >= 19) {  
                hours1000++;
                total += 1000;
            } else {                          
                hours1500++;
                total += 1500;
            }
        }
        System.out.println("Hours rented: " + (end - start));
        System.out.println("Total rental fee: " + total + " RWF");
    }
    }

