import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int startTime;
        int endTime;
        int total = 0;

        System.out.print("Enter starting time (0-23): ");
        startTime = input.nextInt();

        System.out.print("Enter ending time (1-24): ");
        endTime = input.nextInt();

        // Validate input
        if (startTime < 0 || startTime > 23 ||
            endTime < 1 || endTime > 24 ||
            startTime >= endTime) {

            System.out.println("Invalid time.");
            return;
        }

        // Calculate cost hour by hour
        for (int hour = startTime; hour < endTime; hour++) {

            if (hour < 7) {
                total += 500;
            }
            else if (hour < 14) {
                total += 1000;
            }
            else if (hour < 19) {
                total += 1500;
            }
            else if (hour < 21) {
                total += 1000;
            }
            else {
                total += 500;
            }
        }

        System.out.println("Total rental cost = " + total + " RWF");
    }
}