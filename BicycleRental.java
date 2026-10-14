import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get user inputs
        System.out.print("Enter start hour (0-23): ");
        int startHour = scanner.nextInt();

        System.out.print("Enter end hour (1-24): ");
        int endHour = scanner.nextInt();

        // 2. Input Validation (Directly enforcing Lab Rule #1)
        if (startHour < 0 || startHour > 23) {
            System.out.println("Error: Start hour must be between 0 and 23.");
            scanner.close();
            return;
        }
        if (endHour < 1 || endHour > 24) {
            System.out.println("Error: End hour must be between 1 and 24.");
            scanner.close();
            return;
        }
        if (startHour >= endHour) {
            System.out.println("Error: Starting time must be less than ending time.");
            scanner.close();
            return;
        }

        int totalCost = 0;

        // 3. Loop through each rented hour and apply rates (Lab Rule #2)
        for (int hour = startHour; hour < endHour; hour++) {
            
            // Rate: 500 RWF for ranges 0-7 and 21-24
            if ((hour >= 0 && hour < 7) || (hour >= 21 && hour < 24)) {
                totalCost += 500;
            } 
            // Rate: 1000 RWF for ranges 7-14 and 19-21
            else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                totalCost += 1000;
            } 
            // Rate: 1500 RWF for range 14-19
            else if (hour >= 14 && hour < 19) {
                totalCost += 1500;
            }
        }

        // 4. Output the final calculated rent
        System.out.println("Total rent: " + totalCost + " RWF");
        
        scanner.close();
    }
}