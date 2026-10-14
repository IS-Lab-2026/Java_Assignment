import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start;
        int end;

        System.out.print("Enter starting hour (0-23): ");
        start = scanner.nextInt();

        System.out.print("Enter ending hour (1-24): ");
        end = scanner.nextInt();

        if (start < 0 || start > 23 || end < 1 || end > 24 || start >= end) {
            System.out.println("Invalid input. The start must be 0-23, "
                    + "the end must be 1-24, and start must be less than end.");
            scanner.close();
            return;
        }

        int total = 0;

        // Each loop iteration represents one rented hour.
        for (int hour = start; hour < end; hour++) {
            if (hour < 7 || hour >= 21) {
                total += 500;
            } else if (hour < 14 || hour >= 19) {
                total += 1000;
            } else {
                total += 1500;
            }
        }

        System.out.println("Total rental cost: " + total + " RWF");

        scanner.close();
    }
}
