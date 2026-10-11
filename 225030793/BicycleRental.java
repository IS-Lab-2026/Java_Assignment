/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment;

/**
 *
 * @author Gueest
 */
import java.util.Scanner;
public class BicycleRental {

    public static void main(String[] args) {
        int Stime,Etime,Rental=0;
        System.out.println("Enter the Start and end time in hours :");
        Scanner input= new Scanner(System.in);
        Stime= input.nextInt();
        Etime= input.nextInt();
        if (Stime > Etime){
            System.out.println("Invalid");
        }
        else if((Stime<0 || Stime >23) ||(Etime <1 || Etime> 24)) {
            System.out.println("Invalid");
        }  
        
        else{
            for (int i = Stime; i < Etime; i++) {
            if((i>=0 && i<7) ||(i>=21 && i<24)) {
                Rental= Rental+500;
            }
            else if((i>=7 && i<14) || (i>=19 && i<21)){
                Rental= Rental+1000;
            }
            else if(i>=14 && i<=19){
                Rental= Rental+1500;
            }
            }
            System.out.println("The customer will pay:" + Rental);
        }
    }
}
