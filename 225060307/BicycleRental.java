import java.util.Scanner;
public class BicycleRental{
    public static void main(String [] args){
        Scanner y = new Scanner(System.in);
        int start;
        int end;
        int rate;
        int total = 0;
        System.out.println("enter the starting hour: ");
        start= y.nextInt();
        System.out.println("enter the ending hour: ");
        end= y.nextInt();
        //check is the input is correct
        if((start<0||start>23) || (end<1||end>24) || (start>=end)){
            System.out.println("invalid inputed hour");
        }
    else {
        for(int i=start; i<end;i++){
            if(i<7){
                rate=500;
            }
            else if(i<14){
                rate=1000;
            }
             else if(i<19){
                rate=1500;
             }
             else if(i<21){
                rate=1000;
             }
             else {
                rate=500;
             }
             total=total+rate;
        }
    }
System.out.println("Total amount to be paid is: "+total+"RWF");
    }
}