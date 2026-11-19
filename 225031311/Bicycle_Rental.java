/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quitbuttonexample;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Bicycle_Rental {
     public static void main(String[] args) {
        int starttime,endtime;
        int totalcost=0;
        System.out.print("enter starting time(0-23): ");
        Scanner input=new Scanner(System.in);
        starttime=input.nextInt();
        System.out.print("enter ending time (1-24): ");
        endtime=input.nextInt();
        if(starttime<0||starttime>23||endtime<1||endtime>24||starttime>=endtime){
            System.out.println("error:invalid time!");
            System.out.println("try again");
            return;
        }
        System.out.println("hours:");
        for(int hour=starttime;hour<endtime;hour++){
            int rate;
            if((hour>=0&&hour<=6)||(hour>=21&&hour<=23)){
                rate=500;
            }
            else if((hour>=7&&hour<=13)||(hour>=19&&hour<=20)){
                rate=1000;
               
            }
            else{
                rate=1500;
            }
            System.out.println("hour "+ hour + "to" + (hour+1) + ":" + rate + "Rwf");
            totalcost=totalcost+rate;
        }
        System.out.println("total rental hours: "+ (endtime-starttime));
        System.out.println("total cost to pay:" + totalcost + "Rwf");
    }
}

