import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startTime;
        int endTime;

        while (true) {
            System.out.print("Enter starting time (0-23): ");
            if (!input.hasNextInt()) {
                System.out.println("Please enter a whole number.");
                input.next();
                continue;
            }
            startTime = input.nextInt();
            if (startTime < 0 || startTime > 23) {
                System.out.println("Starting time must be between 0 and 23.");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Enter ending time (1-24): ");
            if (!input.hasNextInt()) {
                System.out.println("Please enter a whole number.");
                input.next();
                continue;
            }
            endTime = input.nextInt();
            if (endTime < 1 || endTime > 24 || endTime <= startTime) {
                System.out.println("Ending time must be greater than the starting time and between 1 and 24.");
                continue;
            }
            break;
        }

        int totalCost = 0;

        for (int hour = startTime; hour < endTime; hour++) {
            int rate;
            if (hour < 7 || hour >= 21) {
                rate = 500;
            } else if (hour < 14 || hour >= 19) {
                rate = 1000;
            } else {
                rate = 1500;
            }
            totalCost += rate;
        }

        System.out.println("Total rental cost: " + totalCost + " RWF");
        input.close();
    }
}
