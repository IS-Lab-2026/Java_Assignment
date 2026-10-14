import java.util.Scanner;

class BicycleRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start time (0-23): ");
        int start = input.nextInt();

        System.out.print("Enter end time (1-24): ");
        int end = input.nextInt();

        if (start >= end || start < 0 || start > 23 || end < 1 || end > 24) {
            System.out.println("Invalid input. Start time must be before end time and within valid hours.");
            return;
        }

        int totalRent = 0;
        
        for (int h = start; h < end; h++) {
            if (h < 7 || h >= 21) {
                totalRent += 500;
            } else if ((h >= 7 && h < 14) || (h >= 19 && h < 21)) {
                totalRent += 1000;
            } else {
                totalRent += 1500;
            }
        }

        System.out.println("Total rent to pay: " + totalRent + " RWF");
    }
}