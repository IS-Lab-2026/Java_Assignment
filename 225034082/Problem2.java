package com.mycompany.lab1;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int forest, cup, ring, gills;

        System.out.println("Answer each question with 1 for yes or 0 for no.");

        System.out.print("Does your mushroom grow in a forest? ");
        forest = input.nextInt();
        System.out.print("Does your mushroom have a convex cup? ");
        cup = input.nextInt();

        if (forest == 0) {
            // meadow
            if (cup == 1) {
                System.out.println("Your mushroom is Agaric Jaunissant");
            } else {
                System.out.println("Your mushroom is Coprin Chevelu");
            }
        } else {
            // forest
            if (cup == 1) {
                System.out.print("Does your mushroom have a ring? ");
                ring = input.nextInt();
                if (ring == 1) {
                    System.out.println("Your mushroom is Amanite Tue-mouche");
                } else {
                    System.out.println("Your mushroom is Pied Bleu");
                }
            } else {
                System.out.print("Does your mushroom have gills? ");
                gills = input.nextInt();
                if (gills == 1) {
                    System.out.println("Your mushroom is Girolle");
                } else {
                    System.out.println("Your mushroom is Cepe de Bordeaux");
                }
            }
        }
    }
}