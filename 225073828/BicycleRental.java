import java.util.Scanner;

public class BicycleRental {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting time (0 - 23): ");
        int start = input.nextInt();
        System.out.print("Enter ending time (1 - 24): ");
        int end = input.nextInt()
        int total = 0;
        int hour = start;
        while (hour < end) {
            if ((hour >= 0 && hour < 7) ||
                (hour >= 21 && hour < 24)) {

                total = total + 500;
            }
            else if ((hour >= 7 && hour < 14) ||
                     (hour >= 19 && hour < 21)) {

                total = total + 1000;
            }
            else if (hour >= 14 && hour < 19) {

                total = total + 1500;
            }
            hour++;
        }
        System.out.println("Starting time: " + start);
        System.out.println("Ending time: " + end);
        System.out.println("Total rental cost: " + total + " RWF");
        input.close();
    }
}
