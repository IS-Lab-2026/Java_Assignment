/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.work;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Work {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int start, end;
        int hour;
        int rate;
        int total = 0;

        
        System.out.print("Enter starting time (0-23): ");
        start = input.nextInt();

       
        System.out.print("Enter ending time (1-24): ");
        end = input.nextInt();

      
        if (start < 0 || start > 23 || end < 1 || end > 24 || start >= end) {
            System.out.println("Invalid time.");
        } 
        else {

            hour = start;

           
            while (hour < end) {

                
                if (hour < 7 || hour >= 21) {
                    rate = 500;
                } 
                else if (hour < 14 || hour >= 19) {
                    rate = 1000;
                } 
                else {
                    rate = 1500;
                }

                total = total + rate;

                hour++;
            }

            
            System.out.println("Total cost = " + total + " RWF");
        }

        
    }
}
    

