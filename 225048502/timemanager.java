import java.util.Scanner;

public class timemanager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting time: ");
        int begining = input.nextInt();

        System.out.print("Enter ending time: ");
        int end = input.nextInt();

        if (begining < 0) {
            System.out.println("Invalid start time.");
        } else if (begining> 23) {
            System.out.println("Invalid start time.");
        } else if (end < 1) {
            System.out.println("Invalid end time.");
        } else if (end > 24) {
            System.out.println("Invalid end time.");
        } else if (begining >= end) {
            System.out.println("Start time must be before end time.");
        } else {
            int totalCost = 0;
            int currentHour = begining;

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

        input.close();
    }
}
