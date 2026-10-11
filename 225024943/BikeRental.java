import java.util.Scanner;

public class BikeRental{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the pickup time(only the hour, 0 - 23) : ");
        int x = input.nextInt();

        System.out.print("Enter the ending time(only the hour, 1 - 24) : ");
        int y = input.nextInt();

        
        int cost = 0;

        if (x < 0 || x > 23 || y < 1 || y > 24 || x > y ){
            System.out.println("Invalid input! Try again");
        }

        for(int hr = x; hr < y; hr++ ){
            if ((hr >=0 && hr <7) || (hr >=21 && hr <24)){
                cost+=500;
            }else if((hr >=7 && hr <14) || (hr >=19 && hr <21)){
                cost+=1000;
                
            }else if(hr >=14 && hr <19){
                
                cost+=1500;
            }
        }

        System.out.println("The toal cost is "+cost);
    
    
    }
}