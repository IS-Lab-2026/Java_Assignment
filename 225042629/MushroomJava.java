
 

package com.mycompany.mushroom.java;

/**
 *
 * @author Student
 */
 import java.util.Scanner;
public class MushroomJava {

    public static void main(String[] args) {
    


        Scanner input = new Scanner(System.in);

        String ring;
        String forest;
        String gills;
        String convexCup;

        System.out.println("Think of one of the six mushrooms.");
        System.out.println("Answer only yes or no.");

        // Question 1
        System.out.print("Does your mushroom have a ring? ");
        ring = input.nextLine().toLowerCase();

        if (ring.equals("yes")) {

            // Question 2
            System.out.print("Does your mushroom grow in a forest? ");
            forest = input.nextLine().toLowerCase();

            if (forest.equals("yes")) {

                System.out.println("Your mushroom is Amanite tue-mouche.");

            } else {

                // Question 3
                System.out.print("Does your mushroom have a convex cup? ");
                convexCup = input.nextLine().toLowerCase();

                if (convexCup.equals("yes")) {
                    System.out.println("Your mushroom is Agaric Jaunissant.");
                } else {
                    System.out.println("Your mushroom is Coprin chevelu.");
                }
            }

        } else {

            // Question 2
            System.out.print("Does your mushroom have gills? ");
            gills = input.nextLine().toLowerCase();

            if (gills.equals("no")) {

                System.out.println("Your mushroom is Cepe de Bordeaux.");

            } else {

                // Question 3
                System.out.print("Does your mushroom have a convex cup? ");
                convexCup = input.nextLine().toLowerCase();

                if (convexCup.equals("yes")) {
                    System.out.println("Your mushroom is Pied bleu.");
                } else {
                    System.out.println("Your mushroom is Girolle.");
                }
            }
        }

        input.close();
    }
}


