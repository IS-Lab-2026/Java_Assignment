package javaapplication1;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--- MUSHROOM IDENTIFICATION PROGRAM ---");
        System.out.println();

        // Question 1: Gills
        System.out.print("Does your mushroom have gills? (yes/no): ");
        String gills = input.next().toLowerCase();

        if (gills.equals("no")) {

            // Cepe de bordeaux is the only one with pores
            System.out.println("Your mushroom is: Cepe de bordeaux");

        } else if (gills.equals("yes")) {

            // Question 2: Forest
            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            String forest = input.next().toLowerCase();

            if (forest.equals("no")) {

                // Only Agaric jaunissant and Coprin chevelu grow in meadows
                // Question 3: Ring
                System.out.print("Does your mushroom have a ring? (yes/no): ");
                String ring = input.next().toLowerCase();

                if (ring.equals("yes")) {
                    System.out.println("Your mushroom is: Coprin chevelu");
                } else {
                    System.out.println("Your mushroom is: Agaric jaunissant");
                }

            } else if (forest.equals("yes")) {

                // Question 3: Convex cup
                System.out.print("Does your mushroom have a convex cup? (yes/no): ");
                String convexCup = input.next().toLowerCase();

                if (convexCup.equals("yes")) {

                    // Among forest mushrooms with convex cup:
                    // Amanite tue-mouches or Pied bleu
                    System.out.print("Does your mushroom have a ring? (yes/no): ");
                    String ring = input.next().toLowerCase();

                    if (ring.equals("yes")) {
                        System.out.println("Your mushroom is: Amanite tue-mouches");
                    } else {
                        System.out.println("Your mushroom is: Pied bleu");
                    }

                } else {

                    // The remaining forest mushroom is Girolle
                    System.out.println("Your mushroom is: Girolle");
                }

            } else {
                System.out.println("Invalid answer. Please enter yes or no.");
            }

        } else {
            System.out.println("Invalid answer. Please enter yes or no.");
        }

        input.close();
    }
}