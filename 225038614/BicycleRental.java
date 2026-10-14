import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int startTime;
        int endTime;
        int totalCost = 0;
        int hour;

        // Input
        System.out.print("Enter start time (0-23): ");
        startTime = input.nextInt();

        System.out.print("Enter end time (1-24): ");
        endTime = input.nextInt();

        // Validate input
        if (startTime < 0 || startTime > 23 ||
            endTime < 1 || endTime > 24 ||
            startTime >= endTime) {

            System.out.println("Invalid input!");

        } else {

            // Initialize
            hour = startTime;

            // Repeat until hour reaches endTime
            while (hour < endTime) {

                // Rate: 500 RWF per hour
                if ((hour >= 0 && hour < 7) ||
                    (hour >= 21 && hour < 24)) {

                    totalCost = totalCost + 500;

                // Rate: 1000 RWF per hour
                } else if ((hour >= 7 && hour < 14) ||
                           (hour >= 19 && hour < 21)) {

                    totalCost = totalCost + 1000;

                // Rate: 1500 RWF per hour
                } else {

                    totalCost = totalCost + 1500;
                }

                // Increase hour by 1
                hour = hour + 1;
            }

            // Output
            System.out.println("Total cost: " + totalCost + " RWF");
        }

        input.close();
    }
}