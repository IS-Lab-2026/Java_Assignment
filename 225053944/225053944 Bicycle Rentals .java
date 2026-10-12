import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting time: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending time: ");
        int end = scanner.nextInt();

        if (start < 0) {
            System.out.println("Invalid start time.");
        } else if (start > 23) {
            System.out.println("Invalid start time.");
        } else if (end < 1) {
            System.out.println("Invalid end time.");
        } else if (end > 24) {
            System.out.println("Invalid end time.");
        } else if (start >= end) {
            System.out.println("Start time must be before end time.");
        } else {
            int totalCost = 0;
            int currentHour = start;

            while (currentHour < end) {

                if (currentHour >= 0 && currentHour < 7) {
                    totalCost = totalCost + 500;
                } else if (currentHour >= 21 && currentHour < 24) {
                    totalCost = totalCost + 500;
                }
            
                else if (currentHour >= 7 && currentHour < 14) {
                    totalCost = totalCost + 1000;
                } else if (currentHour >= 19 && currentHour < 21) {
                    totalCost = totalCost + 1000;
                }
                
                else if (currentHour >= 14 && currentHour < 19) {
                    totalCost = totalCost + 1500;
                }

                currentHour = currentHour + 1;
            }

            System.out.println("Total rent cost: " + totalCost + " RWF");
        }

        scanner.close();
    }
}
