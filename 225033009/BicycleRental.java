import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start;
        int end;
        int total = 0;
        int hour;
        int rate;

        System.out.print("Enter starting hour (0 - 23): ");
        start = input.nextInt();
        System.out.print("Enter ending hour (1 - 24): ");
        end = input.nextInt();

        // Check that the input follows the rules of the problem
        if (start < 0 || start > 23 || end < 1 || end > 24) {
            System.out.println("Invalid input: start must be 0-23 and end must be 1-24.");
        } else if (start >= end) {
            System.out.println("Invalid input: start time must be less than end time.");
        } else {
            // Charge each hour of the rental using the rate of that hour
            for (hour = start; hour < end; hour++) {
                if (hour < 7 || hour >= 21) {
                    rate = 500;
                } else if (hour < 14 || hour >= 19) {
                    rate = 1000;
                } else {
                    rate = 1500;
                }
                total = total + rate;
            }
            System.out.printf("Rental from %d to %d (%d hours)\n", start, end, end - start);
            System.out.printf("Total to pay: %d RWF\n", total);
        }
        input.close();
    }
}
