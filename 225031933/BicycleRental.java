import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting time (0-23): ");
        int start = input.nextInt();

        System.out.print("Enter ending time (1-24): ");
        int end = input.nextInt();

        if (start < 0 || start > 23 || end < 1 || end > 24 || start >= end) {
            System.out.println("Invalid time. Start must be before end, within one day.");
            input.close();
            return;
        }

        int totalCost = 0;

        for (int hour = start; hour < end; hour++) {
            if (hour < 7 || hour >= 21) {
                totalCost += 500;
            } else if (hour < 14 || hour >= 19) {
                totalCost += 1000;
            } else {
                totalCost += 1500;
            }
        }

        System.out.println("Rental duration: " + (end - start) + " hour(s)");
        System.out.println("Total rental cost: " + totalCost + " RWF");

        input.close();
    }
}
    

