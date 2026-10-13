
import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startTime;
        int endTime;
        int currentHour;
        int totalCost = 0;

        System.out.print("Enter starting time: ");
        startTime = input.nextInt();

        System.out.print("Enter ending time: ");
        endTime = input.nextInt();

        // Check whether the entered times are valid
        if (startTime < 0 || startTime > 23
                || endTime < 1 || endTime > 24
                || startTime >= endTime) {

            System.out.println("Invalid time.");

        } else {
            currentHour = startTime;

            // Calculate the cost for every rented hour
            while (currentHour < endTime) {

                if (currentHour < 7) {
                    totalCost += 500;

                } else if (currentHour < 14) {
                    totalCost += 1000;

                } else if (currentHour < 19) {
                    totalCost += 1500;

                } else if (currentHour < 21) {
                    totalCost += 1000;

                } else {
                    totalCost += 500;
                }

                currentHour++;
            }

            System.out.println(
                "Total rental cost: " + totalCost + " RWF"
            );
        }

        input.close();
    }
}
