// Online Java Compiler (Editor)
// Write and run Java online using this editor.

import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter start time (0-23): ");
            int start = input.nextInt();

            System.out.print("Enter end time (1-24): ");
            int end = input.nextInt();

            if (start < 0 || start > 23 || end < 1 || end > 24 || start >= end) {
                System.out.println("Invalid input time.");
                return;
            }

            int totalCost = 0;

            for (int hour = start; hour < end; hour++) {
                if ((hour >= 0 && hour < 7) || (hour >= 21 && hour < 24)) {
                    totalCost += 500;
                } else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                    totalCost += 1000;
                } else if (hour >= 14 && hour < 19) {
                    totalCost += 1500;
                }
            }

            System.out.println("Your payment is: " + totalCost + " RWF");
        }
    }
}
