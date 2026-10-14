import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int start, end, total;

        System.out.print("Enter starting time: ");
        start = input.nextInt();

        System.out.print("Enter ending time: ");
        end = input.nextInt();

        if (end <= 7) {
            total = (end - start) * 500;
        }
        else if (start >= 7 && end <= 14) {
            total = (end - start) * 1000;
        }
        else if (start >= 14 && end <= 19) {
            total = (end - start) * 1500;
        }
        else if (start >= 19 && end <= 21) {
            total = (end - start) * 1000;
        }
        else if (start >= 21) {
            total = (end - start) * 500;
        }
        else {
            total = 0;
            System.out.println("The rental crosses different price ranges.");
        }

        if (total > 0) {
            System.out.println("Total cost = " + total + " RWF");
            
        }
input.close();
    }
}