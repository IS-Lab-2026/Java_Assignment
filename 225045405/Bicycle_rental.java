
import java.util.Scanner;

public class Bicycle_rental {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int start;
        int end;
        int time;
        int amount;
        int Total = 0;

        System.out.print("Enter starting time (0-23): ");
        start = input.nextInt();

        System.out.print("Enter ending time (1-24): ");
        end = input.nextInt();

        time = start;

        while (time < end) {

            if (time < 7) {
                amount = 500;
            } else if (time < 14) {
                amount = 1000;
            } else if (time < 19) {
                amount = 1500;
            } else if (time < 21) {
                amount = 1000;
            } else {
                amount = 500;
            }

            Total = Total + amount;

            time++;
        }

        System.out.println("Total rental cost: "
                + Total + " RWF");
    }
}
