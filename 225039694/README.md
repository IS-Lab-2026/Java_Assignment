REG NUMBER: 225039694
This repository contains two Java console applications developed as part of a Java programming assignment:

MUSHROOM1. PROJECT

package com.mycompany.mushroom1;                 // Declares the package this class belongs to.

import java.util.Scanner;                         // Imports the Scanner class to read user input.

public class Mushroom1 {                          // Declares the main class of the program.
    public static void main(String[] args) {      // Main method – entry point of the program.
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object to read from the keyboard.

        // Displays an introductory message to the user.
        System.out.println("Think of a mushroom, then answer yes or no.");

        // First question: does the mushroom have gills?
        System.out.print("Does your mushroom have gills? ");
        String gills = scanner.next();            // Reads the user's answer.

        if (gills.equals("no")) {                 // If the mushroom has no gills...
            System.out.println("Your mushroom is: Cepe de bordeau"); // ...it is a Cepe de bordeau.
        }
        else {                                    // If the mushroom has gills...
            // Second question: does it grow in a forest?
            System.out.print("Does your mushroom grow in a forest? ");
            String forest = scanner.next();       // Reads the user's answer.

            if (forest.equals("no")) {            // If it does NOT grow in a forest...
                // Third question: does it have a convex cup?
                System.out.print("Does your mushroom have a convex cup? ");
                String cup = scanner.next();      // Reads the user's answer.

                if (cup.equals("yes")) {          // If it has a convex cup...
                    System.out.println("Your mushroom is: Agaric Jaunissant"); // ...it is an Agaric Jaunissant.
                } else {                          // If it does NOT have a convex cup...
                    System.out.println("Your mushroom is: Coprin chevelu"); // ...it is a Coprin chevelu.
                }
            }
            else {                                // If it DOES grow in a forest...
                // Third question: does it have a convex cup?
                System.out.print("Does your mushroom have a convex cup? ");
                String cup = scanner.next();      // Reads the user's answer.

                if (cup.equals("no")) {           // If it does NOT have a convex cup...
                    System.out.println("Your mushroom is: Girolle"); // ...it is a Girolle.
                } else {                          // If it HAS a convex cup...
                    // Fourth question: does it have a ring?
                    System.out.print("Does your mushroom have a ring? ");
                    String ring = scanner.next(); // Reads the user's answer.

                    if (ring.equals("yes")) {     // If it has a ring...
                        System.out.println("Your mushroom is: Amanite tue-mouche"); // ...it is an Amanite tue-mouche.
                    } else {                      // If it does NOT have a ring...
                        System.out.println("Your mushroom is: Pied bleu"); // ...it is a Pied bleu.
                    }
                }
            }
        }

        scanner.close();                          // Closes the Scanner to free resources.
    }
}






 RENTALBUSINESS PROJECT




package com.mycompany.rentalbusiness;          // Declares the package this class belongs to.

import java.util.Scanner;                        // Imports the Scanner class to read user input.

public class Rentalbusiness {                    // Declares the main class of the program.
    public static void main(String[] args) {     // Main method – entry point of the program.
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object to read from the keyboard.

        // Prompts the user to enter the starting hour.
        System.out.print("Enter starting hour (0-23): ");
        int startTime = scanner.nextInt();       // Reads the starting hour as an integer.

        // Prompts the user to enter the ending hour.
        System.out.print("Enter ending hour (1-24): ");
        int endTime = scanner.nextInt();         // Reads the ending hour as an integer.

        // Validates that the hours are within the allowed range.
        if (startTime < 0 || startTime > 23 || endTime < 1 || endTime > 24) {
            System.out.println("Error: Invalid hour range."); // Prints error message.
            return;                               // Exits the program early.
        }

        // Ensures the starting time is strictly less than the ending time.
        if (startTime >= endTime) {
            System.out.println("Error: Starting time must be less than ending time."); // Error message.
            return;                               // Exits the program early.
        }

        int totalCost = 0;                        // Initialises the total rental cost to zero.

        // Loops through each hour in the rental period.
        for (int hour = startTime; hour < endTime; hour++) {

            // Night hours (00:00–06:59 and 21:00–23:59) cost 500 RWF.
            if ((hour >= 0 && hour < 7) || (hour >= 21 && hour < 24)) {
                totalCost += 500;                 // Adds 500 RWF to the total.
            }
            // Morning/evening hours (07:00–13:59 and 19:00–20:59) cost 1000 RWF.
            else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                totalCost += 1000;                // Adds 1000 RWF to the total.
            }
            // Afternoon hours (14:00–18:59) cost 1500 RWF.
            else if (hour >= 14 && hour < 19) {
                totalCost += 1500;                // Adds 1500 RWF to the total.
            }
        }

        // Displays the final rental fee to the user.
        System.out.println("Total rental fee: " + totalCost + " RWF");

        scanner.close();                          // Closes the Scanner to free resources.
    }
}

