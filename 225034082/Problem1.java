package com.mycompany.lab1;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startHour, endHour, hour, rent, total;

        System.out.print("Enter the starting hour: ");
        startHour = input.nextInt();
        System.out.print("Enter the ending hour: ");
        endHour = input.nextInt();

        // check the input once
        if (startHour < 0 || endHour > 24 || startHour >= endHour) {
            System.out.println("Invalid input");
        } else {
            total = 0;
            hour = startHour;

            // go through each hour of the rental
            while (hour < endHour) {
                if (hour < 7 || hour >= 21) {
                    rent = 500;
                } else if (hour < 14 || hour >= 19) {
                    rent = 1000;
                } else {
                    rent = 1500;
                }
                total = total + rent;
                hour = hour + 1;
            }

            System.out.println("Total to pay: " + total + " RWF");
        }
    }
}