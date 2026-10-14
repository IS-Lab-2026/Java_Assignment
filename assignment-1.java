 import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter starting time (hour 0-23): ");
        int startTime = scanner.nextInt();

        System.out.print("Enter ending time (hour 1-24): ");
        int endTime = scanner.nextInt();

        // Validate inputs based on constraints
        if (startTime < 0 || startTime > 23 || endTime < 1 || endTime > 24 || startTime >= endTime) {
            System.out.println("Invalid input! Ensure start time is between 0-23, end time is between 1-24, and start < end.");
            return;
        }

        int totalCost = 0;

        // Loop through each hour of the rental period
        for (int hour = startTime; hour < endTime; hour++) {
            // Determine rate for the current hour block (from 'hour' to 'hour + 1')
            if ((hour >= 0 && hour < 7) || (hour >= 21 && hour < 24)) {
                totalCost += 500;
            } else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                totalCost += 1000;
            } else if (hour >= 14 && hour < 19) {
                totalCost += 1500;
            }
        }

        // Output the final computed price
        System.out.println("Total rental cost: " + totalCost + " RWF");
        
        
    }
}