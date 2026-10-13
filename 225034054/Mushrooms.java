package com.mycompany.mushrooms;
import java.util.Scanner;

public class Mushrooms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Think of one of the following mushrooms:");
        System.out.println("- Agaric Jaunissant");
        System.out.println("- Amanite tue-mouche");
        System.out.println("- Cepe de bordeaux");
        System.out.println("- Coprin chevelu");
        System.out.println("- Girolle");
        System.out.println("- Pied bleu");
        System.out.println();

        
        boolean forest = askYesNo(sc, "Does your mushroom grow in a forest?");

        if (!forest) {
           
            boolean convex = askYesNo(sc, "Does your mushroom have a convex cup?");
            if (convex) {
                System.out.println("\nYour mushroom is: Agaric Jaunissant");
            } else {
                System.out.println("\nYour mushroom is: Coprin chevelu");
            }
        } else {
            
            boolean convex = askYesNo(sc, "Does your mushroom have a convex cup?");

            if (convex) {
                
                boolean ring = askYesNo(sc, "Does your mushroom have a ring?");
                if (ring) {
                    System.out.println("\nYour mushroom is: Amanite tue-mouche");
                } else {
                    System.out.println("\nYour mushroom is: Pied bleu");
                }
            } else {
                
                boolean gills = askYesNo(sc, "Does your mushroom have gills?");
                if (gills) {
                    System.out.println("\nYour mushroom is: Girolle");
                } else {
                    System.out.println("\nYour mushroom is: Cepe de bordeaux");
                }
            }
        }

        sc.close();
    }

    private static boolean askYesNo(Scanner sc, String question) {
        while (true) {
            System.out.print(question + " (yes/no): ");
            String answer = sc.nextLine().trim().toLowerCase();
            if (answer.equals("yes") || answer.equals("y")) {
                return true;
            } else if (answer.equals("no") || answer.equals("n")) {
                return false;
            } else {
                System.out.println("Please answer 'yes' or 'no'.");
            }
        }
    }
}

