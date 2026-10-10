import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int startTime;
        int endTime;
        int total = 0;
        int rate;

        System.out.print("Enter starting time (0-23): ");
        startTime = input.nextInt();

        System.out.print("Enter ending time (1-24): ");
        endTime = input.nextInt();

        for (int hour = startTime; hour < endTime; hour++) {

            if (hour < 7 || hour >= 21) {
                rate = 500;
            } 
            else if (hour < 14 || hour >= 19) {
                rate = 1000;
            } 
            else {
                rate = 1500;
            }

            total = total + rate;
        }

        System.out.println("Total rental cost = " + total + " RWF");

        input.close();
    }
}
