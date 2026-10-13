
package my.bicyclerental;

import java.util.Scanner;

public class BicycleRental {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int starthour;
        int endhour;
        int total=0;
        System.out.println("Enter starting hour (0-23): ");
        starthour=input.nextInt();
        System.out.println("Enter the ending hour(1-24): ");
        endhour =input.nextInt();
        
        for(int hour=starthour;hour<endhour;hour++){
            int rent;
            if((hour>=0&&hour<7) ||(hour>=21&&hour<24)){
                rent=500;
            }
            else if((hour>=7&&hour<14)||(hour>=19&&hour<21)){
                rent=1000;
            }
            else{
                rent=1500;
            }
            total=total+rent;
        }
            System.out.println("Total Rental cost: " + total + "RWF");
        
    }
}
