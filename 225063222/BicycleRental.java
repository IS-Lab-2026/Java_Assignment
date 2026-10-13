import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {

       
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Enter starting hour (0-23): ");
            int startTime = input.nextInt();
            
            System.out.print("Enter ending hour (1-24): ");
            int endTime = input.nextInt();
            
            int totalCost = 0;
            
            
            for (int hour = startTime; hour < endTime; hour++) {
                
                int rate;
                
                
                if ((hour >= 0 && hour < 7) || (hour >= 21 && hour < 24)) {
                    rate = 500;
                }
                
               
                else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                    rate = 1000;
                }
                
               
                else {
                    rate = 1500;
                }
                
                totalCost = totalCost + rate;
            }
            
           
            System.out.println("Total rental cost: " + totalCost + " RWF");
        }
    }
}