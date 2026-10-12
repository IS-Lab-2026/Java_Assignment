import java.util.Scanner;

public class BicycleRental {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int starttime;
        int endtime;
        int totalCost = 0;
         int time;

        System.out.print("Enter starting time: ");
        starttime = input.nextInt();

        System.out.print("Enter ending time: ");
        endtime = input.nextInt();
        time  = endtime-starttime;

        if (starttime >= endtime) {
            System.out.println("Invalid time.");
        } else {

            

                if (time < 7) {
                    totalCost = time * 500;
                }
                else if (time < 14) {
                    totalCost =  time * 1000;
                }
                else if (time < 19) {
                    totalCost =  time * 1500;
                }
                else if (time < 21) {
                    totalCost = time * 1000;
                }
                else {
                    totalCost = time * 500;
                }
            }

            System.out.println("Total cost = " + totalCost  );
        }
    }

