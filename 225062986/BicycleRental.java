import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Start hour (0-23): ");
        int start = input.nextInt();

        System.out.print("End hour (1-24): ");
        int end = input.nextInt();

        int total = 0;

        for (int hour = start; hour < end; hour++) {
            if (hour < 7) {
                total = total + 500;
            } else if (hour < 14) {
                total = total + 1000;
            } else if (hour < 19) {
                total = total + 1500;
            } else if (hour < 21) {
                total = total + 1000;
            } else {
                total = total + 500;
            }
        }

        System.out.println("You pay: " + total + " RWF");
    }
}