/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mushroomsale;

import java.util.Scanner;



public class MushroomSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Does your mushroom have gills? (yes/no): ");
        String gills = input.next().trim().toLowerCase();

        if (gills.equals("no")) {
            System.out.println("Your mushroom is: Cepe de Bordeaux");
        } else {
            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            String forest = input.next().trim().toLowerCase();

            System.out.print("Does your mushroom have a ring? (yes/no): ");
            String ring = input.next().trim().toLowerCase();

            System.out.print("Does your mushroom have a convex cup? (yes/no): ");
            String convex = input.next().trim().toLowerCase();

            if (forest.equals("no") && convex.equals("yes")) {
                System.out.println("Your mushroom is: Agaric Jaunissant");
            } else if (forest.equals("no") && convex.equals("no")) {
                System.out.println("Your mushroom is: Coprin Chevelu");
            } else if (forest.equals("yes") && ring.equals("yes")) {
                System.out.println("Your mushroom is: Amanite Tue-Mouche");
            } else if (forest.equals("yes") && ring.equals("no") && convex.equals("yes")) {
                System.out.println("Your mushroom is: Pied Bleu");
            } else {
                System.out.println("Your mushroom is: Girolle");
            }
        }

        input.close();
    }
}

