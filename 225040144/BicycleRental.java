import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startTime;
        int endTime;
        int totalCost = 0;

        System.out.print("Enter starting hour (0-23): ");
        startTime = input.nextInt();

        System.out.print("Enter ending hour (1-24): ");
        endTime = input.nextInt();

        if (startTime < 0 || startTime > 23 ||
            endTime < 1 || endTime > 24 ||
            startTime >= endTime) {

            System.out.println("Invalid rental time.");
            System.out.println(
                "The starting hour must be less than the ending hour."
            );

        } else {
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

            System.out.println("Starting hour: " + startTime);
            System.out.println("Ending hour: " + endTime);
            System.out.println("Total rental cost: "
                               + totalCost + " RWF");
        }

        input.close();
    }
}