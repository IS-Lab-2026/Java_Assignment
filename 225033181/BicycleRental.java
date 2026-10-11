import java.util.Scanner;
public class BicycleRental{
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting time (0-23): ");
        int startTime = input.nextInt();
        System.out.print("Enter ending time (1-24): ");
        int endTime = input.nextInt();
        
        if (startTime < 0 || startTime > 23 || endTime < 1 || endTime > 24) {
            System.out.println("Error: Invalid hour ranges provided.");
            return;
        }
        if (startTime >= endTime) {
            System.out.println("Error: Starting time must be less than ending time.");
            return;
        }

        int totalCost = 0;
        for (int h = startTime; h < endTime; h++) {
            if ((h >= 0 && h < 7) || (h >= 21 && h < 24)) {
                totalCost += 500;
            } else if ((h >= 7 && h < 14) || (h >= 19 && h < 21)) {
                totalCost += 1000;
            } else if (h >= 14 && h < 19) {
                totalCost += 1500;
            }
        }
        System.out.println("Total rent to pay: " + totalCost + " RWF");
        
        input.close();
        }}
