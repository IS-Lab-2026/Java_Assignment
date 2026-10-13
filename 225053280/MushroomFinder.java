
package com.mycompany.mushroomfinder;
import java.util.Scanner;
public class MushroomFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Does your mushroom have gills? (yes/no): ");
        String gills = sc.nextLine();

        if (gills.equalsIgnoreCase("no")) {
            System.out.println("Your mushroom is Cepe de Bordeaux.");
        } else {
            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            String forest = sc.nextLine();

            if (forest.equalsIgnoreCase("no")) {
                System.out.print("Does your mushroom have a ring? (yes/no): ");
                String ring = sc.nextLine();

                if (ring.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is Coprin Chevelu or Agaric Jaunissant.");
                } else {
                    System.out.println("Your mushroom is Agaric Jaunissant.");
                }
            } else {
                System.out.print("Does your mushroom have a ring? (yes/no): ");
                String ring = sc.nextLine();

                if (ring.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is Amanite tue-mouche.");
                } else {
                    System.out.print("Does your mushroom have a convex cup? (yes/no): ");
                    String convex = sc.nextLine();

                    if (convex.equalsIgnoreCase("yes")) {
                        System.out.println("Your mushroom is Pied Bleu.");
                    } else {
                        System.out.println("Your mushroom is Girolle.");
                    }
                }
            }
        }
    }
}
