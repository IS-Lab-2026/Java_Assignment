import java.util.Scanner;
public class bicylerental {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter starting hour:");
        int start = in.nextInt();
        System.out.print("Enter ending hour:");
        int end = in.nextInt();
        boolean valid = start >= 0 && start <= 23
                     && end >= 1 && end <= 24
                     && start < end;
        if (valid) {
            int total = 0;
            for (int h = start; h < end; h++) {
                if (h < 7 || h >= 21) {
                    total += 500;
                } else if (h < 14 || h >= 19) {   
                    total += 1000;
                } else {                          
                    total += 1500;
                }
            }
            System.out.println("Total rental fee: " + total + " rwf");
        } else {
            System.out.println("Invalid input: ");
        }
    }
}
 