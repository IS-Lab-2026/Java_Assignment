import java.util.Scanner;

public class BicycleRental {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int startTime;
        int endTime;
        int hour;
        int rate;
        int total = 0;

        System.out.print("Enter start time (0-23): ");
        startTime = input.nextInt();

        System.out.print("Enter end time (1-24): ");
        endTime = input.nextInt();

        if (startTime < 0 || startTime > 23 ||
            endTime < 1 || endTime > 24 ||
            startTime >= endTime) {

            System.out.println("Invalid time");

        } else {

            hour = startTime;

            while (hour < endTime) {

                if (hour < 7) {
                    rate = 500;
                } else if (hour < 14) {
                    rate = 1000;
                } else if (hour < 19) {
                    rate = 1500;
                } else if (hour < 21) {
                    rate = 1000;
                } else {
                    rate = 500;
                }

                total = total + rate;
                hour++;
            }

            System.out.println("Total rental cost = "
                               + total + " RWF");
        }

        input.close();
    }
}