package javaapplication1;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] Args) {

        System.out.println("---WELCOME TO OUR BICYCLE RENTAL SERVICES---\n");

        System.out.println("    --TABLE SHOWING HOURS AND PRICES--\n");
        System.out.println("From 00:00 - 07:00 and 21:00 - 24:00 price is:\t500 RWF");
        System.out.println("From 07:00 - 14:00 and 19:00 - 21:00 price is:\t1000 RWF");
        System.out.println("From 14:00 - 19:00 price is:\t\t\t\t1500 RWF");

        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a starting time (0-23): ");
        int time1 = input.nextInt();

        System.out.print("Enter ending time (1-24): ");
        int time2 = input.nextInt();

        // Validate starting time
        if (time1 < 0 || time1 > 23) {
            System.out.println("Invalid starting time. It must be between 0 and 23.");
            return;
        }

        // Validate ending time
        if (time2 < 1 || time2 > 24) {
            System.out.println("Invalid ending time. It must be between 1 and 24.");
            return;
        }

        // Starting time must be less than ending time
        if (time1 >= time2) {
            System.out.println("Invalid rental period. Starting time must be less than ending time.");
            return;
        }

        // Display rental period
        System.out.println("\nYour rental time starts at: " + time1);
        System.out.println("And ends at: " + time2);

        int hours = time2 - time1;

        System.out.println("Your total hours to rent is: " + hours);

        // Calculate total cost
        int total = 0;

        for (int hour = time1; hour < time2; hour++) {

            if (hour < 7) {
                total = total + 500;

            } else if (hour < 14) {
                total = total + 1000;

            } else if (hour < 19) {
                total = total + 1500;

            } else if (hour < 21) {
                total = total + 1000;

            } else {
                total = total + 500;
            }
        }

        System.out.println("\nThe rental total cost is: " + total + " RWF");

        input.close();
    }
}

