import java.util.*; 
public class BicyRent{
    public static void main(String[]args){
        int startingTime,endTime,totalHours;
        int totalRent = 0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the starting time in hours (0-23):");
        startingTime=input.nextInt();
        System.out.println("Enter the ending time in hours (1-24):");
        endTime=input.nextInt();
        totalHours = startingTime;
          
          if (endTime > startingTime){
            
             if((startingTime >= 0 && startingTime <=23) && (endTime >=1 && endTime <= 24)){
              while(totalHours < endTime){
           if((totalHours>=0 && totalHours < 7) || (totalHours>=21 && totalHours<=24)){
             totalRent += 500;
             totalHours++;
           }else if((totalHours>=7 && totalHours<14) || (totalHours>=19 && totalHours < 21)){
            totalRent += 1000;
            totalHours++;
            System.out.println("here" );
           }else if ((totalHours>=14 && totalHours< 19))  {
              totalRent +=1500;
              totalHours++;
           }
        } }
        }
        
        
        
          System.out.println("TOTAL RENT: " + totalRent);
          input.close();
        
    }
}