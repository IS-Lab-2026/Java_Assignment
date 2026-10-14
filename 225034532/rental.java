import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startTime, endTime;
        int totalCost = 0;
        int rate;

        System.out.print("Enter starting time (0-23): ");
        startTime = input.nextInt();

        System.out.print("Enter ending time (1-24): ");
        endTime = input.nextInt();

        if (startTime < 0 || startTime > 23 ||
            endTime < 1 || endTime > 24 ||
            startTime >= endTime) {

            System.out.println("Invalid time entered.");
        } else {
            for (int hour = startTime; hour < endTime; hour++) {

                if (hour < 7 || hour >= 21) {
                    rate = 500;
                } else if (hour < 14) {
                    rate = 1000;
                } else if (hour < 19) {
                    rate = 1500;
                } else {
                    rate = 1000;
                }

                totalCost = totalCost + rate;
            }

            System.out.println("Rental duration: "
                    + (endTime - startTime) + " hours");

            System.out.println("Total rental cost: "
                    + totalCost + " RWF");
        }

        input.close();
    }
}
