package com.mycompany.mushroomfinder;

import java.util.Scanner;

public class MushroomFinder {

    static Scanner scanner = new Scanner(System.in);

    static boolean ask(String question) {
        String answer;
        do {
            System.out.print(question + " (yes/no): ");
            answer = scanner.nextLine().trim().toLowerCase();
        } while (!answer.equals("yes") && !answer.equals("no"));
        return answer.equals("yes");
    }

    public static void main(String[] args) {
        System.out.println("Think of a mushroom (one of the six).");
        String result;

        if (!ask("Does your mushroom grow in a forest?")) {
            if (ask("Does your mushroom have a convex cup?")) {
                result = "Agaric jaunissant";
            } else {
                result = "Coprin chevelu";
            }
        } else if (ask("Does your mushroom have a convex cup?")) {
            if (ask("Does your mushroom have a ring?")) {
                result = "Amanite tue-mouche";
            } else {
                result = "Pied bleu";
            }
        } else {
            if (ask("Does your mushroom have gills?")) {
                result = "Girolle";
            } else {
                result = "Cepe de bordeau";
            }
        }

        System.out.println("Your mushroom is: " + result);
        scanner.close();
    }
}