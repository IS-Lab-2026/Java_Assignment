import java.util.Scanner;

public class Rental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start time (0 to 23): ");
        int start = input.nextInt();

        System.out.print("Enter end time (1 to 24): ");
        int end = input.nextInt();

        if (start < 0 || start > 23 || end < 1 || end > 24 || start >= end) {
            System.out.println("Invalid input!");
        } else {
            int total = 0;

            
            for (int hour = start; hour < end; hour++) {
                if (hour >= 0 && hour < 7) {
                    total = total + 500;
                } else if (hour >= 7 && hour < 14) {
                    total = total + 1000;
                } else if (hour >= 14 && hour < 19) {
                    total = total + 1500;
                } else if (hour >= 19 && hour < 21) {
                    total = total+1000;
                } else if (hour >= 21 && hour < 24) {
                    total = total + 500;
                }
            }

            System.out.println("Totalprice to pay: " + total + " RWF");
        }
    }
}
