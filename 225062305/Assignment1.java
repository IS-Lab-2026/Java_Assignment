import java.util.Scanner;
public class TimeTieredCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double st;          
        double et;          
        double rate;        
        double hours;       
        double total_cost;  
        System.out.print("Enter start time (st): ");
        st = input.nextDouble();
        System.out.print("Enter end time (et): ");
        et = input.nextDouble();
        if (st >= 0 && st <= 24 && et > 1 && et <= 24 && st < et) {
            if (st >= 0 && et <= 7) {
                rate = 500;
                hours = et - st;
                total_cost = hours * rate;
                System.out.println("Total cost: " + total_cost);
            } 
            else if (st >= 7 && et <= 14) {
                rate = 1000;
                hours = et - st;
                total_cost = hours * rate;
                System.out.println("Total cost: " + total_cost);
            } 
            else if (st >= 14 && et <= 19) {
                rate = 1500;
                hours = et - st;
                total_cost = hours * rate;
                System.out.println("Total cost: " + total_cost);
            } 
            else {
                System.out.println("Invalid input");
            }

        } else {
            System.out.println("Invalid input");
        }
    }
}

