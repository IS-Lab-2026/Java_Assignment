

package com.mycompany.lucky;
import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startTime, endTime;
        int total = 0;

        System.out.print("Enter starting time: ");
        startTime = input.nextInt();

        System.out.print("Enter ending time: ");
        endTime = input.nextInt();

        for (int hour = startTime; hour < endTime; hour++) {

            if ((hour >= 0 && hour < 7) || (hour >= 21 && hour < 24)) {
                total = total + 500;
            }
            else if ((hour >= 7 && hour < 14) ||
                     (hour >= 19 && hour < 21)) {
                total = total + 1000;
            }
            else if (hour >= 14 && hour < 19) {
                total = total + 1500;
            }
        }

        System.out.println("Total rental cost = " + total + " RWF");

        input.close();
    }
}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
 
