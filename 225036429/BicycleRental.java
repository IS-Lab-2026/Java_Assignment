import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int start, end, duration;
        int rate;
        int total;

        System.out.print("Enter starting time (0-23): ");
        start = input.nextInt();

        System.out.print("Enter ending time (1-24): ");
        end = input.nextInt();

        // Validate the input
        if (start < 0 || start > 23 ||
            end < 1 || end > 24 ||
            start >= end) {

            System.out.println("Invalid input.");
            System.out.println(
                "Ensure that the starting time is between 0 and 23, "
                + "the ending time is between 1 and 24, "
                + "and the starting time is earlier than the ending time."
            );

        } else {

            // Calculate rental duration
            duration = end - start;

            // Determine the hourly rate
            if ((start >= 0 && start < 7) ||
                (start >= 21 && start <= 23)) {
                rate = 500;
            } else if ((start >= 7 && start < 14) ||
                       (start >= 19 && start < 21)) {
                rate = 1000;
            } else {
                rate = 1500;
            }

            // Calculate total cost
            total = duration * rate;

            // Display results
            System.out.println(
                "Rental duration: " + duration + " hours"
            );
            System.out.println(
                "Rate: " + rate + " RWF per hour"
            );
            System.out.println(
                "Total cost: " + total + " RWF"
            );
        }

        input.close();
    }
}
