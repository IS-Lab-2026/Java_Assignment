Problem 1: Bicycle Rental

Algorithm

Initialize Input: Start by opening a scanner to read the user's input from the console.

Read Data: Ask the user to enter the starting hour (0-23) and the ending hour (1-24).

Validation: Check if the inputs are valid. The start time must be less than the end time, and both must fall within their allowed ranges. If invalid, show an error and stop the program.

Calculate Rent: If the inputs are valid, set the initial total rent to 0. Use a loop that starts at the start time and increments by 1 until it reaches the end time.

Apply Rates: Inside the loop, check the current hour to determine the rate:

If the hour is between 0-7 or 21-24, add 500 RWF.

If the hour is between 7-14 or 19-21, add 1000 RWF.

If the hour is between 14-19, add 1500 RWF.

Output: Once the loop finishes calculating every hour, display the total rent to the user.

Code

import java.util.Scanner;

class BicycleRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start time (0-23): ");
        int start = input.nextInt();

        System.out.print("Enter end time (1-24): ");
        int end = input.nextInt();

        if (start >= end || start < 0 || start > 23 || end < 1 || end > 24) {
            System.out.println("Invalid input. Start time must be before end time and within valid hours.");
            return;
        }

        int totalRent = 0;
        
        for (int h = start; h < end; h++) {
            if (h < 7 || h >= 21) {
                totalRent += 500;
            } else if ((h >= 7 && h < 14) || (h >= 19 && h < 21)) {
                totalRent += 1000;
            } else {
                totalRent += 1500;
            }
        }

        System.out.println("Total rent to pay: " + totalRent + " RWF");
    }
}


Problem 2: Mushroom Identifier

Algorithm

Initialize Input: Open a scanner to read the user's "yes" or "no" answers.

Ask First Question: Ask the user if the mushroom has a ring.

Branch 1 (Has Ring): If the answer is "yes":

Ask if it grows in a forest. If "yes", the mushroom is Amanite tue-mouche.

If "no", ask if it has a convex cup. If "yes", it's Agaric Jaunissant. If "no", it's Coprin chevelu.

Branch 2 (No Ring): If the answer to the first question is "no":

Ask if it has gills. If "no" (meaning it has pores), the mushroom is Cepe de bordeau.

If "yes", ask if it has a convex cup. If "yes", it's Pied bleu. If "no", it's Girolle.

Output: Display the final identified mushroom based on the path taken through the questions.

Code

import java.util.Scanner;

class MushroomIdentifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Does your mushroom have a ring? (yes/no): ");
        String ring = input.nextLine().trim().toLowerCase();

        if (ring.equals("yes")) {
            System.out.print("Does it grow in a forest? ");
            if (input.nextLine().trim().toLowerCase().equals("yes")) {
                System.out.println("Your mushroom is: Amanite tue-mouche");
            } else {
                System.out.print("Does it have a convex cup? ");
                if (input.nextLine().trim().toLowerCase().equals("yes")) {
                    System.out.println("Your mushroom is: Agaric Jaunissant");
                } else {
                    System.out.println("Your mushroom is: Coprin chevelu");
                }
            }
        } else {
            System.out.print("Does it have gills? ");
            if (input.nextLine().trim().toLowerCase().equals("no")) {
                System.out.println("Your mushroom is: Cepe de bordeau");
            } else {
                System.out.print("Does it have a convex cup? ");
                if (input.nextLine().trim().toLowerCase().equals("yes")) {
                    System.out.println("Your mushroom is: Pied bleu");
                } else {
                    System.out.println("Your mushroom is: Girolle");
                }
            }
        }
    }
}

