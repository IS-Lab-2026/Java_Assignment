import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting hour (0-23): ");
        int start = input.nextInt();

        System.out.print("Enter ending hour (1-24): ");
        int end = input.nextInt();

        if (start < 0 || start > 23 || end < 1 || end > 24 || start >= end) {
            System.out.println("Invalid time. Start must be 0-23 and less than end; end must be 1-24.");
            input.close();
            return;
        }

        int totalCost = 0;

        for (int hour = start; hour < end; hour++) {
            int rate;

            if (hour < 7 || hour >= 21) {
                rate = 500;
            } else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                rate = 1000;
            } else {
                rate = 1500;
            }

            totalCost += rate;
        }

        System.out.println("Rental duration: " + (end - start) + " hour(s)");
        System.out.println("Total rental cost: " + totalCost + " RWF");

        input.close();
    }
}
