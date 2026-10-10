/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package school;

/**
 *
 * @author el-matadol
 */
import java.util.Scanner;
public class assign1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int startHour;
        int endHour;
        int totalCost = 0;
        
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter the starting hour: ");
        startHour= input.nextInt();
        System.out.println("enter the ending hour: ");
        endHour= input2.nextInt();
        if(startHour < 0 || endHour > 24 || startHour >= endHour){
        System.out.println("invalid hours");
        }
        
        for (int h = startHour; h < endHour; h++) {
                if ((h >= 0 && h < 7) || (h >= 21 && h < 24)) {
                    totalCost += 500;
                } else if ((h >= 7 && h < 14) || (h >= 19 && h < 21)) {
                    totalCost += 1000;
                    
                } else if (h >= 14 && h < 19) {
                    totalCost += 1500;
                }
            }
        
        System.out.println("the total cost= "+ totalCost);
        
        

    }
    
}
