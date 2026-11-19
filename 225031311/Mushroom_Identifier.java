/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mushroom_identifier;



import java.util.Scanner;



public class Mushroom_Identifier {
    public static String getValidInput(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("yes") || input.equals("no")) {
                return input;
            } else {
                System.out.println("Invalid input! Please answer only yes or no.");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("only answer yes or no");

        String ring = getValidInput(sc, "Q1: Does your mushroom have a ring? (yes/no): ");

        if (ring.equals("yes")) {
            
            String forest = getValidInput(sc, "Q2: Does it grow in a forest? (yes/no): ");
            
            if (forest.equals("yes")) {
                System.out.println("Result: Amanite tue-mouche ");
            } else {
                String convex = getValidInput(sc, "Q3: Is the cap convex? (yes/no): ");
                if (convex.equals("yes")) {
                    System.out.println("Result: Agaric Jaunissant ");
                } else {
                    System.out.println("Result: Coprin chevelu ");
                }
            }
        } else {
           
            String gills = getValidInput(sc, "Q2: Does it have gills? (yes=pores=no) (yes/no): ");

            if (gills.equals("no")) {
                System.out.println("Result: Cepe de Bordeaux (only one with pores)");
            } else {
                String convex = getValidInput(sc, "Q3: Is the cap convex? (yes/no): ");
                if (convex.equals("yes")) {
                    System.out.println("Result: Pied bleu ");
                } else {
                    System.out.println("Result: Girolle ");
                }
            }
        }
        sc.close();
    }
}

