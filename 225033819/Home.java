/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.home;
import java.util.Scanner;

/**
 *
 * @author alain
 */
public class Home {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int startTime;
        int endTime;
        int total = 0;
        int rate;
        
        System.out.print("Enter startind time (0-23):");
        startTime = input.nextInt();
        
        System.out.print("Enter ending time(1-24):");
        endTime = input.nextInt();
        
        if (startTime < 0 || startTime > 23 || endTime < 1 || endTime > 24 || startTime >= endTime){
            System.out.println("Invalid time");
            System.out.println("Starting time must be between o and 23");
            System.out.println("Ending time must be between 1 and 24");
            System.out.println("Starting time must be less than ending time");
        }
        else 
               {
            
            for (int hour = startTime; hour < endTime; hour++){
                if(hour >=0 && hour <7 ){
                    rate = 500;
                }
                else if (hour >= 7 && hour < 14){
                    rate = 1000;
                }
                else if (hour >= 14 && hour < 19){
                    rate = 1500;
                }
                else if (hour >= 19 && hour < 21){
                    rate = 1000;
                }
                else{
                    rate = 500;
                }
                total = total + rate;
            }
            
             System.out.println("Total rental cost =" + total + "RWF");
        
        
                }
            }
        }
    
