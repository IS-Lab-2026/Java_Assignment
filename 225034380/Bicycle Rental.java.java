import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int startTime;
        int endTime;
        int hours;
        int rate;
        int total;

        System.out.print("Enter starting time: ");
        startTime = input.nextInt();

        System.out.print("Enter ending time: ");
        endTime = input.nextInt();

        hours = endTime - startTime;

        if (startTime < 7) {
            rate = 500;
        }
        else if (startTime < 14) {
            rate = 1000;
        }
        else if (startTime < 19) {
            rate = 1500;
        }
        else if (startTime < 21) {
            rate = 1000;
        }
        else {
            rate = 500;
        }

        total = hours * rate;

        System.out.println("Rental hours = " + hours);
        System.out.println("Rate per hour = " + rate + " RWF");
        System.out.println("Total cost = " + total + " RWF");
    }
}
