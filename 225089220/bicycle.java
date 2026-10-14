import java.util.Scanner;

public class bicycle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start hour (0-23): ");
        int startTime = scanner.nextInt();

        System.out.print("Enter end hour (1-24): ");
        int endTime = scanner.nextInt();

        if (startTime < 0 || startTime >= 23 || endTime <= 1 || endTime > 24 || startTime >= endTime) {
            System.out.println("Invalid rental hours entered.");
            return;
        }

        int totalCost = 0;

        for (int hour = startTime; hour < endTime; hour++) {
            if ((hour >= 0 && hour < 7) || (hour >= 21 && hour < 24)) {
                totalCost += 500;  // 500 RWF/hr for 0-7 and 21-24
            } else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                totalCost += 1000; // 1000 RWF/hr for 7-14 and 19-21
            } else if (hour >= 14 && hour < 19) {
                totalCost += 1500; // 1500 RWF/hr for 14-19
            }
        }

        System.out.println("Total rental cost: " + totalCost + " RWF");
        scanner.close();
    }
}