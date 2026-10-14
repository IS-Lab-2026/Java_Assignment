import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int start, end, total = 0;

        System.out.print("Enter starting time (0-23): ");
        start = input.nextInt();

        System.out.print("Enter ending time (1-24): ");
        end = input.nextInt();

        for (int hour = start; hour < end; hour++) {

            if (hour < 7 || hour >= 21) {
                total += 500;
            } else if (hour < 14 || hour < 21 && hour >= 19) {
                total += 1000;
            } else {
                total += 1500;
            }
        }

        System.out.println("Total rental cost: " + total + " RWF");

        input.close();
    }
}
