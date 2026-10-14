package com.mycompany.mushroom1;

import java.util.Scanner;

public class Mushroom1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of a mushroom, then answer yes or no.");

       
        System.out.print("Does your mushroom have gills? ");
        String gills = scanner.next();

        if (gills.equals("no")) {
            System.out.println("Your mushroom is: Cepe de bordeau");
        } 
        else {
           
            System.out.print("Does your mushroom grow in a forest? ");
            String forest = scanner.next();

            if (forest.equals("no")) {
             
                System.out.print("Does your mushroom have a convex cup? ");
                String cup = scanner.next();

                if (cup.equals("yes")) {
                    System.out.println("Your mushroom is: Agaric Jaunissant");
                } else {
                    System.out.println("Your mushroom is: Coprin chevelu");
                }
            } 
            else {
                
                System.out.print("Does your mushroom have a convex cup? ");
                String cup = scanner.next();

                if (cup.equals("no")) {
                    System.out.println("Your mushroom is: Girolle");
                } else {
                   
                    System.out.print("Does your mushroom have a ring? ");
                    String ring = scanner.next();

                    if (ring.equals("yes")) {
                        System.out.println("Your mushroom is: Amanite tue-mouche");
                    } else {
                        System.out.println("Your mushroom is: Pied bleu");
                    }
                }
            }
        }
        
        scanner.close();
    }
}
