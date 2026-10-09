

package com.mycompany.mushroomidentifier;
import java.util.Scanner;
 
public class MushroomIdentifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("Think of one of these mushrooms:");
        System.out.println("Agaric jaunissant, Amanite tue-mouche, Cepe de bordeaux,");
        System.out.println("Coprin chevelu, Girolle, Pied bleu");
        System.out.println("Answer each question with yes or no.\n");
 
        System.out.print("Does your mushroom have a ring? ");
        String ring = input.next();
 
        if (ring.equalsIgnoreCase("yes")) {
            
            System.out.print("Does your mushroom grow in a forest? ");
            String forest = input.next();
 
            if (forest.equalsIgnoreCase("yes")) {
                System.out.println("Your mushroom is: Amanite tue-mouche");
            } else {
                
                System.out.print("Does your mushroom have a convex cup? ");
                String cup = input.next();
 
                if (cup.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is: Agaric jaunissant");
                } else {
                    System.out.println("Your mushroom is: Coprin chevelu");
                }
            }
        } else {
            
            System.out.print("Does your mushroom have gills? ");
            String gills = input.next();
 
            if (gills.equalsIgnoreCase("no")) {
                System.out.println("Your mushroom is: Cepe de bordeaux");
            } else {
             
                System.out.print("Does your mushroom have a convex cup? ");
                String cup = input.next();
 
                if (cup.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is: Pied bleu");
                } else {
                    System.out.println("Your mushroom is: Girolle");
                }
            }
        }
    }
}


