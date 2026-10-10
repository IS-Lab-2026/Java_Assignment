import  java.util.Scanner;
public class RentalBicycle{
public static void main (String[]args)
{
Scanner input= new Scanner(system.in);
int start,end,total=0;
System.out.println("Enter starting time:");
start=input.nextInt();
System.out.println("Enter ending Time:?");
end=input.nextInt();
for(int hour=start; hour<end; hour++){
if( hour<7|| hour>=21){
total=total+500;
}
else if (hour<14||hour>=19){
total=total+1000;
}
else{
total=total+1500;
}
System.out.println("total="+total+"rwf");
}
}
}
