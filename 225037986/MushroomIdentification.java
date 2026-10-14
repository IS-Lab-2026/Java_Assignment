package com.mycompany.mavenproject2;

import java.util.Scanner;

public class MushroomIdentification {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            String answer;
            String mushroom;

            System.out.println("MUSHROOM IDENTIFICATION");
            System.out.println();

            System.out.print("Does it have a convex cap? (yes/no): ");
            answer = input.next();

            if (answer.equalsIgnoreCase("yes")) {

                System.out.print("Does it grow in a forest? (yes/no): ");
                answer = input.next();

                if (answer.equalsIgnoreCase("no")) {
                    mushroom = "Agaric jaunissant";
                } else {

                    System.out.print("Does it have a ring? (yes/no): ");
                    answer = input.next();

                    if (answer.equalsIgnoreCase("yes")) {
                        mushroom = "Amanite tue-mouche";
                    } else {
                        mushroom = "Pied bleu";
                    }
                }

            } else {

                System.out.print("Does it have gills? (yes/no): ");
                answer = input.next();

                if (answer.equalsIgnoreCase("no")) {
                    mushroom = "Cepe de bordeaux";
                } else {

                    System.out.print("Does it grow in a forest? (yes/no): ");
                    answer = input.next();

                    if (answer.equalsIgnoreCase("yes")) {
                        mushroom = "Girolle";
                    } else {
                        mushroom = "Coprin chevelu";
                    }
                }
            }

            System.out.println();
            System.out.println("Mushroom identified: " + mushroom);
        }
    }
}